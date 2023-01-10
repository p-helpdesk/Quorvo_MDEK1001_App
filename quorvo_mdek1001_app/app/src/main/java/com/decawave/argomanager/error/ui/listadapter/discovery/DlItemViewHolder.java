/*
 * LEAPS - Low Energy Accurate Positioning System.
 *
 * Copyright (c) 2016-2023, LEAPS. All rights reserved.
 */

package com.decawave.argomanager.error.ui.listadapter.discovery;

import android.view.View;
import android.widget.TextView;

import com.decawave.argomanager.R2;
import com.decawave.argomanager.error.ui.view.NodeStateView;
import com.decawave.argomanager.error.ui.view.SimpleProgressView;

import butterknife.BindView;
import butterknife.ButterKnife;
import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flipview.FlipView;
import eu.davidea.viewholders.FlexibleViewHolder;

/**
 * Argo project.
 */

class DlItemViewHolder {

    static class Generic extends FlexibleViewHolder {

        Generic(View itemView, FlexibleAdapter adapter) {
            super(itemView, adapter);
            // extract references
            ButterKnife.bind(this, itemView);
        }

    }

    static class DiscoveredNode extends Generic {
        // references to views
        // common stuff here
        @BindView(R2.id.progressView)
        SimpleProgressView progress;
        @BindView(R2.id.nodeName)
        TextView nodeName;
        @BindView(R2.id.nodeId)
        TextView tvNodeId;
        @BindView(R2.id.nodeBleAddress)
        TextView bleAddress;
        @BindView(R2.id.nodeTypeView)
        FlipView flipView;
        @BindView(R2.id.failIndicator)
        TextView failIndicator;
        //
        NodeStateView nodeTypeView;

        DiscoveredNode(View itemView, FlexibleAdapter adapter) {
            super(itemView, adapter);
            // extract references
            ButterKnife.bind(this, itemView);
            // set up the drawable
            flipView.setFrontLayout(nodeTypeView = new NodeStateView(itemView.getContext()));
        }

        @Override
        public void toggleActivation() {
            super.toggleActivation();
            // Here we use a custom Animation inside the ItemView
            flipView.flip(mAdapter.isSelected(getAdapterPosition()));
        }


    }

    static class UnknownNetwork extends Generic {
        // references to views
        @BindView(R2.id.networkId)
        TextView networkName;
        @BindView(R2.id.networkAnchors)
        TextView anchorNodes;
        @BindView(R2.id.networkTags)
        TextView tagNodes;

        UnknownNetwork(View itemView,
                       FlexibleAdapter adapter) {
            super(itemView, adapter);
            // extract references
            ButterKnife.bind(this, itemView);
        }

        @Override
        public boolean onLongClick(View view) {
            // hack to workaround bug in FlexibleAdapter - selectable = false
            FlexibleAdapter.OnItemLongClickListener oldL = mAdapter.mItemLongClickListener;
            mAdapter.mItemLongClickListener = null;
            super.onLongClick(view);
            mAdapter.mItemLongClickListener = oldL;
            // ignore
            return false;
        }

    }

    static class DeclaredNetwork extends Generic {
        // references to views
        @BindView(R2.id.networkId)
        TextView networkName;
        @BindView(R2.id.networkAnchors)
        TextView anchorNodes;
        @BindView(R2.id.networkTags)
        TextView tagNodes;

        DeclaredNetwork(View itemView,
                          FlexibleAdapter adapter) {
            super(itemView, adapter);
            // extract references
            ButterKnife.bind(this, itemView);
        }

        @Override
        public boolean onLongClick(View view) {
            // hack to workaround bug in FlexibleAdapter - selectable = false
            FlexibleAdapter.OnItemLongClickListener oldL = mAdapter.mItemLongClickListener;
            mAdapter.mItemLongClickListener = null;
            super.onLongClick(view);
            mAdapter.mItemLongClickListener = oldL;
            // ignore
            return false;
        }

    }

    static class Title extends FlexibleViewHolder {
        @BindView(R2.id.discoveryInfo)
        TextView discoveryInfo;

        Title(View view, FlexibleAdapter adapter) {
            super(view, adapter);
            ButterKnife.bind(this, view);
        }

        @Override
        public boolean onLongClick(View view) {
            // hack to workaround bug in FlexibleAdapter - selectable = false, reported bug #416
            FlexibleAdapter.OnItemLongClickListener oldL = mAdapter.mItemLongClickListener;
            mAdapter.mItemLongClickListener = null;
            super.onLongClick(view);
            mAdapter.mItemLongClickListener = oldL;
            // ignore
            return false;
        }

    }

    static class SectionHeader extends FlexibleViewHolder {
        @BindView(R2.id.tvTitle)
        TextView tvTitle;

        SectionHeader(View view, FlexibleAdapter adapter, boolean stickyHeader) {
            super(view, adapter, stickyHeader);
            // extract references
            ButterKnife.bind(this, itemView);
        }

    }

}
