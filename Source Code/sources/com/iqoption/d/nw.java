package com.iqoption.d;

import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.iqoption.view.text.FormattedTextView;
import com.iqoption.x.R;

/* compiled from: FragmentKycRadioButtonBindingImpl */
public class nw extends nv {
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
        awV.put(R.id.answer, 1);
        awV.put(R.id.checkMark, 2);
    }

    public nw(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, awU, awV));
    }

    private nw(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FormattedTextView) objArr[1], (LinearLayout) objArr[0], (ImageView) objArr[2]);
        this.awW = -1;
        this.bxK.setTag(null);
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
