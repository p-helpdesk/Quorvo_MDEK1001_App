/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2023, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.error.ui.actionbar;

import static com.decawave.argomanager.ArgoApp.daApp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.annimon.stream.function.Supplier;
import com.decawave.argomanager.R;
import com.decawave.argomanager.error.ui.MainActivity;
import com.decawave.argomanager.error.ui.fragment.FragmentType;

import java.util.Arrays;
import java.util.List;

public class AbSpinnerAdapter<T extends Enum<T> & SpinnerItem> extends BaseAdapter {

    private int selectedItemPosition;

    private final Supplier<Integer> preferenceItemProvider;

    private MainActivity mMainActivity;

    private List<T> mValues;

    public AbSpinnerAdapter(T[] spinnerValues, MainActivity mainActivity, Supplier<Integer> preferenceItemProvider) {
        this.mMainActivity = mainActivity;
        this.mValues = Arrays.asList(spinnerValues);
        this.preferenceItemProvider = preferenceItemProvider;
    }

    /**
     * {@inheritDoc}
     */
    public int getCount() {
        return mValues.size();
    }

    /**
     * {@inheritDoc}
     */
    public T getItem(int position) {
        return mValues.get(position);
    }

    /**
     * {@inheritDoc}
     */
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            final LayoutInflater inflater = (LayoutInflater) mMainActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.ab_spinner_popup_item, parent, false);
        }
        //convertView.setLayoutParams(new ListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT, AbsListView.LayoutParams.WRAP_CONTENT));
        final int pos = preferenceItemProvider.get();

        final T item = getItem(position);
        final boolean selected = (pos == position);
        final TextView textView = (TextView) convertView.findViewById(R.id.abSpinnerItemText);
        int textColor;
        if (selected) {
            textColor = ContextCompat.getColor(convertView.getContext(), R.color.mtrl_primary);
        } else {
            textColor = ContextCompat.getColor(convertView.getContext(), R.color.textFg);
        }
        textView.setText(item.getTitleResId());
        //noinspection ResourceAsColor
        textView.setTextColor(textColor);

        return convertView;
    }

    int measureContentWidth() {
        ViewGroup mMeasureParent = null;
        int maxWidth = 0;
        View itemView = null;
        int itemType = 0;

        final int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        final int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        final int count = getCount();
        for (int i = 0; i < count; i++) {
            final int positionType = getItemViewType(i);
            if (positionType != itemType) {
                itemType = positionType;
                itemView = null;
            }

            if (mMeasureParent == null) {
                mMeasureParent = new FrameLayout(mMainActivity);
            }

            itemView = getView(i, itemView, mMeasureParent);
            itemView.measure(widthMeasureSpec, heightMeasureSpec);

            final int itemWidth = itemView.getMeasuredWidth();

            if (itemWidth > maxWidth) {
                maxWidth = itemWidth;
            }
        }

        return maxWidth;
    }

    public int findItemPositionForFragmentType(FragmentType fragmentType) {
        int i = 0;
        for (T item : mValues) {
            if (item.getFragmentType() == fragmentType) {
                return i;
            }
            i++;
        }

        throw new IllegalArgumentException("" + fragmentType);
    }

    public T getSelectedItem() {
        return getItem(selectedItemPosition);
    }

    public void setSelectedItemPosition(int selectedItemPosition) {
        if (this.selectedItemPosition != selectedItemPosition) {
            this.selectedItemPosition = selectedItemPosition;
            notifyDataSetChanged();
        }
    }

    public String getSelectedAnchorText() {
        final T selectedItem = getItem(selectedItemPosition);
        return daApp.getResources().getString(selectedItem.getTitleResId());
    }

}
