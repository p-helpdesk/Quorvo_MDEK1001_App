// Generated code from Butter Knife. Do not modify!
package com.decawave.argomanager.error.ui.fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.decawave.argomanager.R;
import com.decawave.argomanager.error.ui.view.GridView;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GridFragment_ViewBinding implements Unbinder {
  private GridFragment target;

  private View view7f0800ac;

  private TextWatcher view7f0800acTextWatcher;

  private View view7f0800ad;

  private TextWatcher view7f0800adTextWatcher;

  private View view7f0800b1;

  private TextWatcher view7f0800b1TextWatcher;

  @UiThread
  public GridFragment_ViewBinding(final GridFragment target, View source) {
    this.target = target;

    View view;
    target.noNetworkSelected = Utils.findRequiredView(source, R.id.noNetwork, "field 'noNetworkSelected'");
    target.grid = Utils.findRequiredViewAsType(source, R.id.gridView, "field 'grid'", GridView.class);
    target.etPxCenterX = Utils.findRequiredViewAsType(source, R.id.floorplan_center_x, "field 'etPxCenterX'", EditText.class);
    target.etPxCenterY = Utils.findRequiredViewAsType(source, R.id.floorplan_center_y, "field 'etPxCenterY'", EditText.class);
    target.etPx10m = Utils.findRequiredViewAsType(source, R.id.floorplan_zoom_factor, "field 'etPx10m'", EditText.class);
    target.tilZoom = Utils.findRequiredViewAsType(source, R.id.floorplan_zoom_factor_hint, "field 'tilZoom'", TextInputLayout.class);
    target.etFloorplanProperties = Utils.findRequiredView(source, R.id.floorPlanEts, "field 'etFloorplanProperties'");
    target.rootView = Utils.findRequiredViewAsType(source, R.id.rootView, "field 'rootView'", ViewGroup.class);
    target.floorPlanControls = Utils.findRequiredViewAsType(source, R.id.floorPlanControls, "field 'floorPlanControls'", ViewGroup.class);
    target.lockControl = Utils.findRequiredViewAsType(source, R.id.floorplan_control_lock, "field 'lockControl'", ImageView.class);
    target.eraseControl = Utils.findRequiredViewAsType(source, R.id.floorplan_control_erase, "field 'eraseControl'", ImageView.class);
    target.rotateLeftControl = Utils.findRequiredViewAsType(source, R.id.floorplan_control_rotate_left, "field 'rotateLeftControl'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.floorplan_center_x, "method 'applyFloorPlanChange'");
    view7f0800ac = view;
    view7f0800acTextWatcher = new TextWatcher() {
      @Override
      public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
      }

      @Override
      public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
      }

      @Override
      public void afterTextChanged(Editable p0) {
        target.applyFloorPlanChange();
      }
    };
    ((TextView) view).addTextChangedListener(view7f0800acTextWatcher);
    view = Utils.findRequiredView(source, R.id.floorplan_center_y, "method 'applyFloorPlanChange'");
    view7f0800ad = view;
    view7f0800adTextWatcher = new TextWatcher() {
      @Override
      public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
      }

      @Override
      public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
      }

      @Override
      public void afterTextChanged(Editable p0) {
        target.applyFloorPlanChange();
      }
    };
    ((TextView) view).addTextChangedListener(view7f0800adTextWatcher);
    view = Utils.findRequiredView(source, R.id.floorplan_zoom_factor, "method 'applyFloorPlanChange'");
    view7f0800b1 = view;
    view7f0800b1TextWatcher = new TextWatcher() {
      @Override
      public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
      }

      @Override
      public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
      }

      @Override
      public void afterTextChanged(Editable p0) {
        target.applyFloorPlanChange();
      }
    };
    ((TextView) view).addTextChangedListener(view7f0800b1TextWatcher);
  }

  @Override
  @CallSuper
  public void unbind() {
    GridFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.noNetworkSelected = null;
    target.grid = null;
    target.etPxCenterX = null;
    target.etPxCenterY = null;
    target.etPx10m = null;
    target.tilZoom = null;
    target.etFloorplanProperties = null;
    target.rootView = null;
    target.floorPlanControls = null;
    target.lockControl = null;
    target.eraseControl = null;
    target.rotateLeftControl = null;

    ((TextView) view7f0800ac).removeTextChangedListener(view7f0800acTextWatcher);
    view7f0800acTextWatcher = null;
    view7f0800ac = null;
    ((TextView) view7f0800ad).removeTextChangedListener(view7f0800adTextWatcher);
    view7f0800adTextWatcher = null;
    view7f0800ad = null;
    ((TextView) view7f0800b1).removeTextChangedListener(view7f0800b1TextWatcher);
    view7f0800b1TextWatcher = null;
    view7f0800b1 = null;
  }
}
