// Generated code from Butter Knife. Do not modify!
package com.decawave.argomanager.error.ui.fragment;

import android.view.View;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.decawave.argomanager.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FirmwareUpdateFragment_ViewBinding implements Unbinder {
  private FirmwareUpdateFragment target;

  private View view698;

  @UiThread
  public FirmwareUpdateFragment_ViewBinding(final FirmwareUpdateFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.updateButton, "field 'btnUpdate' and method 'onUpdateButtonClicked'");
    target.btnUpdate = Utils.castView(view, R.id.updateButton, "field 'btnUpdate'", Button.class);
    view698 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onUpdateButtonClicked();
      }
    });
    target.nodeList = Utils.findRequiredViewAsType(source, R.id.nodeList, "field 'nodeList'", RecyclerView.class);
    target.refreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayout, "field 'refreshLayout'", SwipeRefreshLayout.class);
    target.noNodesView = Utils.findRequiredView(source, R.id.tvNoNodes, "field 'noNodesView'");
  }

  @Override
  @CallSuper
  public void unbind() {
    FirmwareUpdateFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btnUpdate = null;
    target.nodeList = null;
    target.refreshLayout = null;
    target.noNodesView = null;

    view698.setOnClickListener(null);
    view698 = null;
  }
}
