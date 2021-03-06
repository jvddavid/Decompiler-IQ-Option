package com.iqoption.d;

import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.iqoption.view.CryptoBumperView;
import com.iqoption.x.R;

/* compiled from: ItemCryptoAssetBindingImpl */
public class wa extends vz {
    @Nullable
    private static final IncludedLayouts awU = null;
    @Nullable
    private static final SparseIntArray awV = new SparseIntArray();
    private long awW;
    @NonNull
    private final RelativeLayout boJ;

    protected boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    static {
        awV.put(R.id.imageLayout, 1);
        awV.put(R.id.touchLayout, 2);
        awV.put(R.id.bumper, 3);
        awV.put(R.id.image, 4);
        awV.put(R.id.sprite, 5);
        awV.put(R.id.disabler, 6);
        awV.put(R.id.label, 7);
    }

    public wa(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, awU, awV));
    }

    private wa(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CryptoBumperView) objArr[3], (View) objArr[6], (ImageView) objArr[4], (FrameLayout) objArr[1], (TextView) objArr[7], (ImageView) objArr[5], (FrameLayout) objArr[2]);
        this.awW = -1;
        this.boJ = (RelativeLayout) objArr[0];
        this.boJ.setTag(null);
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
