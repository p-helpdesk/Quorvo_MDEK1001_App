/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2017, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.argoapi.ble.connection;

import com.decawave.argo.api.interaction.Fail;
import com.decawave.argomanager.argoapi.ble.SynchronousBleGatt;
import com.decawave.argomanager.argoapi.ble.WriteDescriptorRequest;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Operation capable of writing descriptors.
 */
class WriteDescriptorOperation extends AsynchronousGattOperation {

    private WriteDescriptorOperation(@NotNull List<WriteDescriptorRequest> writeRequests,
                                     @Nullable Consumer<SynchronousBleGatt> onSuccess,
                                     @Nullable BiConsumer<SynchronousBleGatt, Fail> onFail,
                                     @Nullable SequentialGattOperationQueue.Token dependsOn) {
        super((gi) -> gi.writeDescriptors(writeRequests), onSuccess, onFail, dependsOn);
    }

    static SequentialGattOperationQueue.Token enqueue(SequentialGattOperationQueue queue, List<WriteDescriptorRequest> writeDescriptorRequests,
                                                      @Nullable Consumer<SynchronousBleGatt> onSuccess,
                                                      @Nullable BiConsumer<SynchronousBleGatt, Fail> onFail,
                                                      SequentialGattOperationQueue.Token dependsOn) {
        return queue.addOperation(new WriteDescriptorOperation(writeDescriptorRequests, onSuccess, onFail, dependsOn));
    }

}
