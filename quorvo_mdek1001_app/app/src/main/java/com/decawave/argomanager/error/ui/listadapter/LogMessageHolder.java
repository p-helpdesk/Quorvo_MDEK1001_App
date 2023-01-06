/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2023, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.error.ui.listadapter;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.decawave.argomanager.R;
import com.decawave.argomanager.util.Util;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Argo project.
 */
public class LogMessageHolder extends RecyclerView.ViewHolder {
    // references to views
    @BindView(R.id.logEntryTime)
    TextView msgTime;
    @BindView(R.id.logEntryText)
    TextView msgText;


    LogMessageHolder(View itemView) {
        super(itemView);
        // extract references
        ButterKnife.bind(this, itemView);
    }

    void bind(long msgTime, String msgText) {
        this.msgTime.setText(formatMsgTime(msgTime));
        this.msgText.setText(msgText);
    }

    private static String formatMsgTime(long time) {
        return Util.formatMsgTime(time);
    }

}
