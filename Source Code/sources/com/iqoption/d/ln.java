package com.iqoption.d;

import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.iqoption.core.ui.a;
import com.iqoption.x.R;

/* compiled from: FragmentCommissionChangeBindingImpl */
public class ln extends lm {
    @Nullable
    private static final IncludedLayouts awU = null;
    @Nullable
    private static final SparseIntArray awV = new SparseIntArray();
    private long awW;

    protected boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        awV.put(R.id.contentLayout, 2);
        awV.put(R.id.linearLayoutContainer, 3);
        awV.put(R.id.optionType, 4);
        awV.put(R.id.infoButton, 5);
        awV.put(R.id.textInfo1, 6);
        awV.put(R.id.textInfo2, 7);
        awV.put(R.id.commissionTitle, 8);
        awV.put(R.id.commissions, 9);
    }

    public ln(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, awU, awV));
    }

    private ln(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[0], (TextView) objArr[1], (LinearLayout) objArr[8], (RecyclerView) objArr[9], (FrameLayout) objArr[2], (ImageView) objArr[5], (LinearLayout) objArr[3], (TextView) objArr[4], (TextView) objArr[6], (TextView) objArr[7]);
        this.awW = -1;
        this.bxe.setTag(null);
        this.brN.setTag(null);
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
        long j;
        synchronized (this) {
            j = this.awW;
            this.awW = 0;
        }
        if ((j & 1) != 0) {
            a.d(this.brN, 0.5f);
        }
    }
}
