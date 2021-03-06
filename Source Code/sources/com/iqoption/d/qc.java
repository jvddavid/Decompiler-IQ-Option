package com.iqoption.d;

import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.iqoption.core.ui.a;
import com.iqoption.view.RobotoTextView;
import com.iqoption.x.R;

/* compiled from: FragmentPendingOrderExecutedBindingImpl */
public class qc extends qb {
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
        awV.put(R.id.titleOrder, 4);
        awV.put(R.id.assetName, 5);
        awV.put(R.id.optionType, 6);
        awV.put(R.id.orderPrice, 7);
        awV.put(R.id.btnConfirmSeporator, 8);
    }

    public qc(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, awU, awV));
    }

    private qc(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[5], (FrameLayout) objArr[0], (TextView) objArr[1], (View) objArr[8], (FrameLayout) objArr[2], (LinearLayout) objArr[3], (TextView) objArr[6], (TextView) objArr[7], (RobotoTextView) objArr[4]);
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
