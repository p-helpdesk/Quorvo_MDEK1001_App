/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2017, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.argoapi.ble.connection;

import com.decawave.argo.api.interaction.Fail;
import com.decawave.argomanager.argoapi.ble.GattInteractionFsm;
import com.decawave.argomanager.argoapi.ble.SynchronousBleGatt;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//import rx.functions.Action1;
//import rx.functions.Action2;
//import rx.functions.Action3;

/**
 * Asynchronous gatt operation predecessor.
 */
class AsynchronousGattOperation implements GenericOperation {
    private Consumer<GattInteractionFsm> operation = null;
    private Callback callback = null;
    private SequentialGattOperationQueue.Token dependsOn = null;


    interface Callback {

        void onSuccess(SynchronousBleGatt gatt);

        void onFail(SynchronousBleGatt gatt, int errorCode, String failMessage);

    }

    private AsynchronousGattOperation(Consumer<GattInteractionFsm> operation,
                                      Callback callback,
                                      SequentialGattOperationQueue.Token dependsOn) {
        this.operation = operation;
        this.callback = callback;
        this.dependsOn = dependsOn;
    }

    private AsynchronousGattOperation(Consumer<GattInteractionFsm> operation,
                                      Consumer<SynchronousBleGatt> onSuccess,
                                      BiConsumer<SynchronousBleGatt, Fail> onFail,
                                      SequentialGattOperationQueue.Token dependsOn, Consumer<GattInteractionFsm> operation1, Consumer<GattInteractionFsm> operation2) {
        this(operation, new Callback() {
            @Override
            public void onSuccess(SynchronousBleGatt gatt) {
                if (onSuccess != null) onSuccess.accept(gatt);
            }

            @Override
            public void onFail(SynchronousBleGatt gatt, int errorCode, String failMessage) {
                if (onFail != null) onFail.accept(gatt, new Fail(errorCode, failMessage));
            }
        }, dependsOn);
    }

//    AsynchronousGattOperation(Consumer<GattInteractionFsm> operation,
//                              Consumer<SynchronousBleGatt> onSuccess,
//                              BiConsumer<SynchronousBleGatt, Fail> onFail,
//                              SequentialGattOperationQueue.Token dependsOn) {
//        this(operation, onSuccess, (synchronousBleGatt, errorCode, failMessage) -> {
//            if (onFail != null) onFail.accept(synchronousBleGatt, new Fail(errorCode, failMessage));
//        }, dependsOn);
//    }

//    AsynchronousGattOperation(Consumer<GattInteractionFsm> operation,
//                              Consumer<SynchronousBleGatt> onSuccess,
//                              Consumer<Fail> onFail,
//                                     SequentialGattOperationQueue.Token dependsOn) {
//        this(operation, onSuccess, (synchronousBleGatt, errorCode, failMessage) -> {
//            if (onFail != null) onFail.accept(new Fail(errorCode, failMessage));
//        }, dependsOn);
//    }

    Callback getCallback() {
        return callback;
    }

    @Override
    public SequentialGattOperationQueue.Token dependsOn() {
        return dependsOn;
    }

    @Override
    public Result execute(GattInteractionFsm gattInteraction) {
        operation.accept(gattInteraction);
        return Result.ASYNC_NOT_KNOWN;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hashCode=" + hashCode() +
                ",dependsOn=" + dependsOn +
                '}';
    }
}
