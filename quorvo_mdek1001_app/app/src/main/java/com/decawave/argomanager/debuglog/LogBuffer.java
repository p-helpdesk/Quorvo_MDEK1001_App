/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2017, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.debuglog;

import org.apache.commons.collections4.queue.CircularFifoQueue;

import java.io.File;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Argo project.
 */

public interface LogBuffer {

    void clear();

    interface Listener {

        void onNewLogEntry(LogEntry logEntry, boolean replaceInAction);

        void onLogReset();

    }

    void setListener(Listener listener);

    void addLogEntry(LogEntry logEntry);

    /**
     * WARNING: either process the returned list immediately or create a copy first
     */
    CircularFifoQueue<LogEntry> getLogEntries();

    // New code for the return void in lambda
    @FunctionalInterface
    public interface TriConsumer<T, U, V> {
        public void accept(T t, U u, V v);

        public default TriConsumer<T, U, V> andThen(TriConsumer<? super T, ? super U, ? super V> after) {
            Objects.requireNonNull(after);
            return (a, b, c) -> {
                accept(a, b, c);
                after.accept(a, b, c);
            };
        }
    }

    //StringBuilder
    void saveLogToFile(File file, TriConsumer<LogEntry, Long, StringBuilder> logEntryFormatter, Consumer<Void> onSuccess, Consumer<Throwable> onFail);

}
