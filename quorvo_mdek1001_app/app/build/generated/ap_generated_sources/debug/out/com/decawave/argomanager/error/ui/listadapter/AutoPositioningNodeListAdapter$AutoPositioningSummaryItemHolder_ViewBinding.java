// Generated code from Butter Knife. Do not modify!
package com.decawave.argomanager.error.ui.listadapter;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.decawave.argomanager.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AutoPositioningNodeListAdapter$AutoPositioningSummaryItemHolder_ViewBinding implements Unbinder {
  private AutoPositioningNodeListAdapter.AutoPositioningSummaryItemHolder target;

  private View view7f080061;

  private View view7f080062;

  @UiThread
  public AutoPositioningNodeListAdapter$AutoPositioningSummaryItemHolder_ViewBinding(
      final AutoPositioningNodeListAdapter.AutoPositioningSummaryItemHolder target, View source) {
    this.target = target;

    View view;
    target.tvLegend = Utils.findRequiredViewAsType(source, R.id.tvLegend, "field 'tvLegend'", TextView.class);
    target.buttonContainer = Utils.findRequiredViewAsType(source, R.id.actionButtonContainer, "field 'buttonContainer'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.btnPreview, "method 'onPreviewClicked'");
    view7f080061 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onPreviewClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.btnSetupZaxis, "method 'onSetupZaxisClicked'");
    view7f080062 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSetupZaxisClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AutoPositioningNodeListAdapter.AutoPositioningSummaryItemHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvLegend = null;
    target.buttonContainer = null;

    view7f080061.setOnClickListener(null);
    view7f080061 = null;
    view7f080062.setOnClickListener(null);
    view7f080062 = null;
  }
}
