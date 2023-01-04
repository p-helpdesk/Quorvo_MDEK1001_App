/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2017, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.ui.fragment;

import com.decawave.argomanager.R;
import com.decawave.argomanager.debuglog.LogBuffer;
import com.decawave.argomanager.ui.listadapter.DebugLogBufferEntryAdapter;

/**
 * Fragment showing debug logs.
 */
public class DebugLogBufferFragment extends LogBufferFragment {

    public DebugLogBufferFragment() {
        super(FragmentType.DEBUG_LOG, daApp.getString(R.string.screen_title_debug_log), "debug.log");
    }

    @Override
    LogBuffer getLogBuffer() {
        return logEntryCollector.getDebugLog();
    }

    @Override
    protected DebugLogBufferEntryAdapter createAdapter() {
        return new DebugLogBufferEntryAdapter(getLogBuffer());
    }

}
