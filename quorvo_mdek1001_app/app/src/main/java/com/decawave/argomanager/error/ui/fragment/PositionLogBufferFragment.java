/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2023, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.error.ui.fragment;

import com.decawave.argomanager.Constants;
import com.decawave.argomanager.R;
import com.decawave.argomanager.debuglog.LogBuffer;
import com.decawave.argomanager.debuglog.LogEntry;
import com.decawave.argomanager.error.ui.listadapter.DebugLogBufferEntryAdapter;
import com.decawave.argomanager.error.ui.listadapter.PositionLogBufferEntryAdapter;
import com.decawave.argomanager.util.Util;
import com.google.common.base.Preconditions;

/**
 * Fragment showing debug logs.
 */
public class PositionLogBufferFragment extends LogBufferFragment {

    public PositionLogBufferFragment() {
        super(FragmentType.POSITION_LOG, daApp.getString(R.string.screen_title_position_log), "position.log");
    }

    @Override
    LogBuffer getLogBuffer() {
        return logEntryCollector.getPositionLog();
    }

    @Override
    protected PositionLogBufferEntryAdapter createAdapter() {
        return new PositionLogBufferEntryAdapter(getLogBuffer());
    }

    @Override
    // simplified logging is sufficient
    protected void formatLogEntry(StringBuilder sb, LogEntry logEntry) {
        if (Constants.DEBUG) {
            Preconditions.checkState(logEntry.exception == null);
            Preconditions.checkState(logEntry.errorCode == null);
        }
        Util.formatLogEntry(sb, logEntry.timeInMillis, logEntry.message);
    }

}
