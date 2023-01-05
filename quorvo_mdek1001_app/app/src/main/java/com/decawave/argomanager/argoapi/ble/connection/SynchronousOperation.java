/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2017, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.argoapi.ble.connection;

import com.decawave.argomanager.argoapi.ble.GattInteractionFsm;

import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Argo project.
 */

class SynchronousOperation implements GenericOperation {
    private final Function<GattInteractionFsm,Boolean> operation;
    private final SequentialGattOperationQueue.Token dependsOn;

    private SynchronousOperation(Function<GattInteractionFsm, Boolean> operation, SequentialGattOperationQueue.Token dependsOn) {
        this.operation = operation;
        this.dependsOn = dependsOn;
    }

    @Override
    public SequentialGattOperationQueue.Token dependsOn() {
        return dependsOn;
    }

    @Override
    public Result execute(GattInteractionFsm gattInteractionFsm) {
        return operation.apply(gattInteractionFsm) ? Result.SYNCHRONOUS_SUCCESS : Result.SYNCHRONOUS_FAIL;
    }

    static SequentialGattOperationQueue.Token enqueue(SequentialGattOperationQueue queue, Function<GattInteractionFsm,Boolean> operation, SequentialGattOperationQueue.Token dependsOn) {
        return queue.addOperation(new SynchronousOperation(operation, dependsOn));
    }

    static SequentialGattOperationQueue.Token enqueueAction(SequentialGattOperationQueue queue, Consumer<GattInteractionFsm> operation, SequentialGattOperationQueue.Token dependsOn) {
        return enqueue(queue, gattInteractionFsm -> {
            operation.accept(gattInteractionFsm);
            return true;
        }, dependsOn);
    }

    @Override
    public @NotNull String toString() {
        return "SynchronousOperation{" +
                "dependsOn=" + dependsOn +
                '}';
    }
}
