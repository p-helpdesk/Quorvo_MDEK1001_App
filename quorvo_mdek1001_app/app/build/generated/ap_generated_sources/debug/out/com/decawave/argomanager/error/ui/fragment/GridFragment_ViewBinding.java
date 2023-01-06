// Generated code from Butter Knife. Do not modify!
package com.decawave.argomanager.error.ui.fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.decawave.argomanager.R;
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
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


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
