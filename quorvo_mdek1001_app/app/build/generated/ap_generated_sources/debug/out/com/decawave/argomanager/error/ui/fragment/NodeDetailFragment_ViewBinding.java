// Generated code from Butter Knife. Do not modify!
package com.decawave.argomanager.error.ui.fragment;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.decawave.argomanager.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NodeDetailFragment_ViewBinding implements Unbinder {
  private NodeDetailFragment target;

  private View view6ab;

  private View view660;

  private View view601;

  private View view60e;

  private View view6b1;

  @UiThread
  public NodeDetailFragment_ViewBinding(final NodeDetailFragment target, View source) {
    this.target = target;

    View view;
    target.etPosX = Utils.findRequiredViewAsType(source, R.id.node_detail_position_x, "field 'etPosX'", EditText.class);
    target.etPosY = Utils.findRequiredViewAsType(source, R.id.node_detail_position_y, "field 'etPosY'", EditText.class);
    target.etPosZ = Utils.findRequiredViewAsType(source, R.id.node_detail_position_z, "field 'etPosZ'", EditText.class);
    target.etNodeLabel = Utils.findRequiredViewAsType(source, R.id.etNodeLabel, "field 'etNodeLabel'", EditText.class);
    target.tvNodeId = Utils.findRequiredViewAsType(source, R.id.tvNodeId, "field 'tvNodeId'", TextView.class);
    target.tvNodeBleAddress = Utils.findRequiredViewAsType(source, R.id.tvNodeBleAddress, "field 'tvNodeBleAddress'", TextView.class);
    target.tvNetworkName = Utils.findRequiredViewAsType(source, R.id.tvNetworkName, "field 'tvNetworkName'", TextView.class);
    target.updateRateLabel = Utils.findRequiredView(source, R.id.updateRateLabel, "field 'updateRateLabel'");
    view = Utils.findRequiredView(source, R.id.updateRateSelector, "field 'updateRateSelector' and method 'onUpdateRateClicked'");
    target.updateRateSelector = view;
    view6ab = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onUpdateRateClicked();
      }
    });
    target.tvUpdateRate = Utils.findRequiredViewAsType(source, R.id.tvUpdateRate, "field 'tvUpdateRate'", TextView.class);
    target.arrowUpdateRate = Utils.findRequiredView(source, R.id.arrowUpdateRate, "field 'arrowUpdateRate'");
    target.stationaryUpdateRateLabel = Utils.findRequiredView(source, R.id.stationaryUpdateRateLabel, "field 'stationaryUpdateRateLabel'");
    view = Utils.findRequiredView(source, R.id.stationaryUpdateRateSelector, "field 'stationaryUpdateRateSelector' and method 'onStationaryUpdateRateClicked'");
    target.stationaryUpdateRateSelector = view;
    view660 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onStationaryUpdateRateClicked();
      }
    });
    target.tvStationaryUpdateRate = Utils.findRequiredViewAsType(source, R.id.tvStationaryUpdateRate, "field 'tvStationaryUpdateRate'", TextView.class);
    target.arrowStationaryUpdateRate = Utils.findRequiredView(source, R.id.arrowStationaryUpdateRate, "field 'arrowStationaryUpdateRate'");
    target.tvNodeType = Utils.findRequiredViewAsType(source, R.id.tvNodeType, "field 'tvNodeType'", TextView.class);
    target.tvUwbMode = Utils.findRequiredViewAsType(source, R.id.tvUwbMode, "field 'tvUwbMode'", TextView.class);
    view = Utils.findRequiredView(source, R.id.networkNameSelector, "field 'networkViewGroup' and method 'onNetworkClicked'");
    target.networkViewGroup = view;
    view601 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onNetworkClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.nodeTypeSelector, "field 'nodeTypeViewGroup' and method 'onNodeTypeClicked'");
    target.nodeTypeViewGroup = view;
    view60e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onNodeTypeClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.uwbModeSelector, "field 'uwbModeViewGroup' and method 'onUwbModeClicked'");
    target.uwbModeViewGroup = view;
    view6b1 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onUwbModeClicked();
      }
    });
    target.chboxInitiator = Utils.findRequiredViewAsType(source, R.id.chboxInitiator, "field 'chboxInitiator'", CheckBox.class);
    target.chboxFirmwareUpdate = Utils.findRequiredViewAsType(source, R.id.chboxFirmwareUpdate, "field 'chboxFirmwareUpdate'", CheckBox.class);
    target.chboxAccelerometer = Utils.findRequiredViewAsType(source, R.id.chboxAccelerometer, "field 'chboxAccelerometer'", CheckBox.class);
    target.chboxLedIndication = Utils.findRequiredViewAsType(source, R.id.chboxLedIndication, "field 'chboxLedIndication'", CheckBox.class);
    target.chboxResponsiveMode = Utils.findRequiredViewAsType(source, R.id.chboxResponsiveMode, "field 'chboxResponsiveMode'", CheckBox.class);
    target.chboxBleEnabled = Utils.findRequiredViewAsType(source, R.id.chboxBleEnabled, "field 'chboxBleEnabled'", CheckBox.class);
    target.chboxLocationEngine = Utils.findRequiredViewAsType(source, R.id.chboxLocationEngine, "field 'chboxLocationEngine'", CheckBox.class);
    target.progressFrame = Utils.findRequiredView(source, R.id.progressFrame, "field 'progressFrame'");
    target.contentFrame = Utils.findRequiredView(source, R.id.contentFrame, "field 'contentFrame'");
    target.tvPositionTitle = Utils.findRequiredViewAsType(source, R.id.tvPositionTitle, "field 'tvPositionTitle'", TextView.class);
    target.anchorSpecificViews = Utils.listFilteringNull(
        Utils.findRequiredView(source, R.id.chboxInitiator, "field 'anchorSpecificViews'"), 
        Utils.findRequiredView(source, R.id.tvPositionTitle, "field 'anchorSpecificViews'"), 
        Utils.findRequiredView(source, R.id.tvPositionContainer, "field 'anchorSpecificViews'"));
    target.tagSpecificViews = Utils.listFilteringNull(
        Utils.findRequiredView(source, R.id.updateRateContainer, "field 'tagSpecificViews'"), 
        Utils.findRequiredView(source, R.id.chboxAccelerometer, "field 'tagSpecificViews'"), 
        Utils.findRequiredView(source, R.id.chboxResponsiveMode, "field 'tagSpecificViews'"), 
        Utils.findRequiredView(source, R.id.chboxLocationEngine, "field 'tagSpecificViews'"));
  }

  @Override
  @CallSuper
  public void unbind() {
    NodeDetailFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etPosX = null;
    target.etPosY = null;
    target.etPosZ = null;
    target.etNodeLabel = null;
    target.tvNodeId = null;
    target.tvNodeBleAddress = null;
    target.tvNetworkName = null;
    target.updateRateLabel = null;
    target.updateRateSelector = null;
    target.tvUpdateRate = null;
    target.arrowUpdateRate = null;
    target.stationaryUpdateRateLabel = null;
    target.stationaryUpdateRateSelector = null;
    target.tvStationaryUpdateRate = null;
    target.arrowStationaryUpdateRate = null;
    target.tvNodeType = null;
    target.tvUwbMode = null;
    target.networkViewGroup = null;
    target.nodeTypeViewGroup = null;
    target.uwbModeViewGroup = null;
    target.chboxInitiator = null;
    target.chboxFirmwareUpdate = null;
    target.chboxAccelerometer = null;
    target.chboxLedIndication = null;
    target.chboxResponsiveMode = null;
    target.chboxBleEnabled = null;
    target.chboxLocationEngine = null;
    target.progressFrame = null;
    target.contentFrame = null;
    target.tvPositionTitle = null;
    target.anchorSpecificViews = null;
    target.tagSpecificViews = null;

    view6ab.setOnClickListener(null);
    view6ab = null;
    view660.setOnClickListener(null);
    view660 = null;
    view601.setOnClickListener(null);
    view601 = null;
    view60e.setOnClickListener(null);
    view60e = null;
    view6b1.setOnClickListener(null);
    view6b1 = null;
  }
}
