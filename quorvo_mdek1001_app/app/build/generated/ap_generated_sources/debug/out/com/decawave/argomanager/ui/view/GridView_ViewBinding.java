// Generated code from Butter Knife. Do not modify!
package com.decawave.argomanager.ui.view;

import android.content.Context;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.core.content.ContextCompat;
import butterknife.Unbinder;
import com.decawave.argomanager.R;
import java.lang.Deprecated;
import java.lang.Override;

public class GridView_ViewBinding implements Unbinder {
  @UiThread
  public GridView_ViewBinding(GridView target) {
    this(target, target.getContext());
  }

  /**
   * @deprecated Use {@link #GridView_ViewBinding(GridView, Context)} for direct creation.
   *     Only present for runtime invocation through {@code ButterKnife.bind()}.
   */
  @Deprecated
  @UiThread
  public GridView_ViewBinding(GridView target, View source) {
    this(target, source.getContext());
  }

  @UiThread
  public GridView_ViewBinding(GridView target, Context context) {
    target.rangingAnchorOkColor = ContextCompat.getColor(context, R.color.tag_ranging_anchor_ok_color);
    target.rangingAnchorFailColor = ContextCompat.getColor(context, R.color.tag_ranging_anchor_fail_color);
    target.passiveColor = ContextCompat.getColor(context, R.color.color_passive_node);
  }

  @Override
  @CallSuper
  public void unbind() {
  }
}
