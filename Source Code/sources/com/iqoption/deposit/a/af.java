package com.iqoption.deposit.a;

import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.iqoption.deposit.r.f;

/* compiled from: FragmentRedirectWebPaymentLightBindingImpl */
public class af extends ae {
    @Nullable
    private static final IncludedLayouts awU = null;
    @Nullable
    private static final SparseIntArray awV = new SparseIntArray();
    private long awW;
    @NonNull
    private final LinearLayout axx;

    protected boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        awV.put(f.toolbarBack, 1);
        awV.put(f.paymentAuthorizationWebView, 2);
    }

    public af(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, awU, awV));
    }

    private af(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (WebView) objArr[2], (ImageView) objArr[1]);
        this.awW = -1;
        this.axx = (LinearLayout) objArr[0];
        this.axx.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.awW = 1;
        }
        requestRebind();
    }

    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.awW != 0) {
                return true;
            }
            return false;
        }
    }

    protected void executeBindings() {
        synchronized (this) {
            long j = this.awW;
            this.awW = 0;
        }
    }
}
