// Copyright (c) 2021 Open Community Project Association https://ocpa.ch
// This software is published under the AGPLv3 license.

//! # Process SYS Messages
//! 
//! The SYS messages are defined in the protobuf format.
//! They are used to send between libqaul and the host OS.
//! 
//! They are used for the following modules:
//! 
//! * BLE module

use core::slice::SlicePattern;

use crossbeam_channel::{unbounded, Sender, Receiver, TryRecvError};
use state::Storage;

use crate::connections::{
    lan::Lan,
    internet::Internet,
};
use crate::connections::ble::Ble;

/// Modules for integrating with JavaVM
use jni::JNIEnv;
use jni::objects::{JClass, JValue, JObject, JString};
use jni::{JavaVM, InitArgsBuilder, JNIVersion, AttachGuard};
use jni::sys::{jstring, jarray, jbyteArray};
/// 

/// receiving end of the mpsc channel
static EXTERN_RECEIVE: Storage<Receiver<Vec<u8>>> = Storage::new();
/// sending end of the mpsc channel
static EXTERN_SEND: Storage<Sender<Vec<u8>>> = Storage::new();
/// sending end of th mpsc channel for libqaul to send
static LIBQAUL_SEND: Storage<Sender<Vec<u8>>> = Storage::new();

/// Handling of SYS messages of libqaul
pub struct Sys {

}


impl Sys {
    /// Initialize SYS module 
    /// Create the sending and receiving channels and put them to state.
    /// Return the receiving channel for libqaul.
    pub fn init() -> Receiver<Vec<u8>> {
        // create channels
        let (libqaul_send, extern_receive) = unbounded();
        let (extern_send, libqaul_receive) = unbounded();

        // save to state
        EXTERN_RECEIVE.set(extern_receive);
        EXTERN_SEND.set(extern_send);
        LIBQAUL_SEND.set(libqaul_send.clone());

        // return libqaul receiving channel
        libqaul_receive
    }

    /// send sys message from the outside to the inside 
    /// of the worker thread of libqaul.
    pub fn send_to_libqaul(binary_message: Vec<u8>) {
        let sender = EXTERN_SEND.get().clone();
        match sender.send(binary_message) {
            Ok(()) => {},
            Err(err) => {
                // log error message
                log::error!("{:?}", err);
            },
        }
    }

    /// check the receiving sys channel if there
    /// are new messages from inside libqaul for 
    /// the outside.
    pub fn receive_from_libqaul() -> Result<Vec<u8>, TryRecvError> {
        let receiver = EXTERN_RECEIVE.get().clone();
        receiver.try_recv()
    }

    /// send an rpc message from inside libqaul thread
    /// to the extern.
    pub fn send_to_extern(message: Vec<u8>) {
        let sender = LIBQAUL_SEND.get().clone();
        match sender.send(message) {
            Ok(()) => {},
            Err(err) => {
                // log error message
                log::error!("{:?}", err);
            },
        }
    }
	
	/// send an sys message to Android BLE Module
    /// This function will call the Android BLE Module's "receiveRequest" function.
    pub fn send_to_android(message: Vec<u8>) {
        let jvm_args = InitArgsBuilder::new()
            .version(JNIVersion::V8)
            .option("-Xcheck:jni")
            .build()
            .unwrap();

        let jvm = JavaVM::new(jvm_args).unwrap();
        let jenv:AttachGuard = jvm.attach_current_thread().unwrap();

        let BleWrapperClass = jenv
            .find_class("net/qaul/ble/core/BleWrapperClass")
            .expect("Failed to load the target class");
        
        let jmessage:jbyteArray = jenv.byte_array_from_slice(message.as_slice()).unwrap();

        let result = jenv.call_static_method(BleWrapperClass, "static_receiveRequest", "([B)V", &[
            JValue::from(jmessage)
        ]);
        
        result.map_err(|e| e.to_string()).unwrap();
    }
	
    /// Process received binary protobuf encoded SYS message
    /// 
    /// This function will decode the message from the binary
    /// protobuf format to rust structures and send it to 
    /// the module responsible.
    pub fn process_received_message( data: Vec<u8>, _lan: Option<&mut Lan>, _internet: Option<&mut Internet> ) {
        // as there is only BLE module just forward the data
        Ble::sys_received(data);
    }

    /// sends a SYS message to the outside
    pub fn send_message(data: Vec<u8>) {
        // send the message
        //Self::send_to_extern(data);
		Self::send_to_android(data);
    }
}
