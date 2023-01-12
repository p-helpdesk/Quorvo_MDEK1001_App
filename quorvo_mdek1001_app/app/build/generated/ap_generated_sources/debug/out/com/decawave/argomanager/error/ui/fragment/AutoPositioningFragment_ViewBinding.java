// Generated code from Butter Knife. Do not modify!
package com.decawave.argomanager.error.ui.fragment;

import android.view.View;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.decawave.argomanager.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AutoPositioningFragment_ViewBinding implements Unbinder {
  private AutoPositioningFragment target;

  private View view5e2;

  private View view62e;

  @UiThread
  public AutoPositioningFragment_ViewBinding(final AutoPositioningFragment target, View source) {
    this.target = target;

    View view;
    target.footerButtonBar = Utils.findRequiredView(source, R.id.footerButtonBar, "field 'footerButtonBar'");
    view = Utils.findRequiredView(source, R.id.measureButton, "field 'measureBtn' and method 'onMeasureButtonClicked'");
    target.measureBtn = Utils.castView(view, R.id.measureButton, "field 'measureBtn'", Button.class);
    view5e2 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onMeasureButtonClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.saveButton, "field 'saveBtn' and method 'onSaveButtonClicked'");
    target.saveBtn = Utils.castView(view, R.id.saveButton, "field 'saveBtn'", Button.class);
    view62e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSaveButtonClicked();
      }
    });
    target.nodeList = Utils.findRequiredViewAsType(source, R.id.nodeList, "field 'nodeList'", RecyclerView.class);
    target.contentView = Utils.findRequiredView(source, R.id.contentView, "field 'contentView'");
    target.noNodesView = Utils.findRequiredView(source, R.id.tvNoNodes, "field 'noNodesView'");
  }

  @Override
  @CallSuper
  public void unbind() {
    AutoPositioningFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.footerButtonBar = null;
    target.measureBtn = null;
    target.saveBtn = null;
    target.nodeList = null;
    target.contentView = null;
    target.noNodesView = null;

    view5e2.setOnClickListener(null);
    view5e2 = null;
    view62e.setOnClickListener(null);
    view62e = null;
  }
}
