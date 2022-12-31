// Generated code from Butter Knife. Do not modify!
package com.decawave.argomanager.ui.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.decawave.argomanager.R;
import com.decawave.argomanager.ui.view.GridView;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GridFragment_ViewBinding implements Unbinder {
  private GridFragment target;

  private View view2131689655;

  private TextWatcher view2131689655TextWatcher;

  private View view2131689656;

  private TextWatcher view2131689656TextWatcher;

  private View view2131689658;

  private TextWatcher view2131689658TextWatcher;

  @UiThread
  public GridFragment_ViewBinding(final GridFragment target, View source) {
    this.target = target;

    View view;
    target.noNetworkSelected = Utils.findRequiredView(source, R.id.noNetwork, "field 'noNetworkSelected'");
    target.grid = Utils.findRequiredViewAsType(source, R.id.gridView, "field 'grid'", GridView.class);
    view = Utils.findRequiredView(source, R.id.floorplan_center_x, "field 'etPxCenterX' and method 'applyFloorPlanChange'");
    target.etPxCenterX = Utils.castView(view, R.id.floorplan_center_x, "field 'etPxCenterX'", EditText.class);
    view2131689655 = view;
    view2131689655TextWatcher = new TextWatcher() {
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
    ((TextView) view).addTextChangedListener(view2131689655TextWatcher);
    view = Utils.findRequiredView(source, R.id.floorplan_center_y, "field 'etPxCenterY' and method 'applyFloorPlanChange'");
    target.etPxCenterY = Utils.castView(view, R.id.floorplan_center_y, "field 'etPxCenterY'", EditText.class);
    view2131689656 = view;
    view2131689656TextWatcher = new TextWatcher() {
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
    ((TextView) view).addTextChangedListener(view2131689656TextWatcher);
    view = Utils.findRequiredView(source, R.id.floorplan_zoom_factor, "field 'etPx10m' and method 'applyFloorPlanChange'");
    target.etPx10m = Utils.castView(view, R.id.floorplan_zoom_factor, "field 'etPx10m'", EditText.class);
    view2131689658 = view;
    view2131689658TextWatcher = new TextWatcher() {
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
    ((TextView) view).addTextChangedListener(view2131689658TextWatcher);
    target.tilZoom = Utils.findRequiredViewAsType(source, R.id.floorplan_zoom_factor_hint, "field 'tilZoom'", TextInputLayout.class);
    target.etFloorplanProperties = Utils.findRequiredView(source, R.id.floorPlanEts, "field 'etFloorplanProperties'");
    target.rootView = Utils.findRequiredViewAsType(source, R.id.rootView, "field 'rootView'", ViewGroup.class);
    target.floorPlanControls = Utils.findRequiredViewAsType(source, R.id.floorPlanControls, "field 'floorPlanControls'", ViewGroup.class);
    target.lockControl = Utils.findRequiredViewAsType(source, R.id.floorplan_control_lock, "field 'lockControl'", ImageView.class);
    target.eraseControl = Utils.findRequiredViewAsType(source, R.id.floorplan_control_erase, "field 'eraseControl'", ImageView.class);
    target.rotateLeftControl = Utils.findRequiredViewAsType(source, R.id.floorplan_control_rotate_left, "field 'rotateLeftControl'", ImageView.class);
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

    ((TextView) view2131689655).removeTextChangedListener(view2131689655TextWatcher);
    view2131689655TextWatcher = null;
    view2131689655 = null;
    ((TextView) view2131689656).removeTextChangedListener(view2131689656TextWatcher);
    view2131689656TextWatcher = null;
    view2131689656 = null;
    ((TextView) view2131689658).removeTextChangedListener(view2131689658TextWatcher);
    view2131689658TextWatcher = null;
    view2131689658 = null;
  }
}
