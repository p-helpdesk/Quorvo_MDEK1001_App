// Generated code from Butter Knife. Do not modify!
package com.decawave.argomanager.error.ui.fragment;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.decawave.argomanager.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DiscoveryFragment_ViewBinding implements Unbinder {
  private DiscoveryFragment target;

  @UiThread
  public DiscoveryFragment_ViewBinding(DiscoveryFragment target, View source) {
    this.target = target;

    target.refreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayout, "field 'refreshLayout'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DiscoveryFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.refreshLayout = null;
  }
}
