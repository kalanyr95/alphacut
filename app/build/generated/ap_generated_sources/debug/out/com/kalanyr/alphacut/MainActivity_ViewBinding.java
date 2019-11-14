// Generated code from Butter Knife. Do not modify!
package com.kalanyr.alphacut;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view7f0a004a;

  private View view7f0a0124;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_login, "field 'btn_login' and method 'loginUser'");
    target.btn_login = Utils.castView(view, R.id.btn_login, "field 'btn_login'", Button.class);
    view7f0a004a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.loginUser();
      }
    });
    view = Utils.findRequiredView(source, R.id.txt_skip, "field 'txt_skip' and method 'skipLoginJustGoHome'");
    target.txt_skip = Utils.castView(view, R.id.txt_skip, "field 'txt_skip'", TextView.class);
    view7f0a0124 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.skipLoginJustGoHome();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btn_login = null;
    target.txt_skip = null;

    view7f0a004a.setOnClickListener(null);
    view7f0a004a = null;
    view7f0a0124.setOnClickListener(null);
    view7f0a0124 = null;
  }
}
