package com.iqoption.charttools.constructor;

import com.iqoption.charttools.model.indicator.constructor.InputItem;
import com.iqoption.core.f;
import com.iqoption.dto.entity.position.Position;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.h;
import kotlin.l;

@kotlin.i(aXC = {1, 1, 11}, aXD = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\u0010\fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0006H\u0016R\u000e\u0010\r\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0010\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, aXE = {"Lcom/iqoption/charttools/constructor/InputColor;", "Lcom/iqoption/charttools/constructor/LabeledInput;", "id", "", "gid", "input", "Lcom/iqoption/charttools/model/indicator/constructor/InputItem;", "default", "", "onChanged", "Lkotlin/Function0;", "", "(IILcom/iqoption/charttools/model/indicator/constructor/InputItem;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "defaultColor", "isDefault", "", "()Z", "isExpanded", "setExpanded", "(Z)V", "label", "getLabel", "()Ljava/lang/String;", "value", "selected", "getSelected", "()I", "setSelected", "(I)V", "toDefault", "Lcom/iqoption/charttools/constructor/InputAdapterItem;", "toInput", "techtools_release"})
/* compiled from: InputAdapterItems.kt */
public final class i extends w {
    private final int aup;
    private int auq;
    private boolean isExpanded;

    public i(int i, int i2, InputItem inputItem, String str, a<l> aVar) {
        h.e(inputItem, "input");
        h.e(str, Position.CLOSE_REASON_DEFAULT);
        super(i, i2, inputItem, str, aVar, null);
        this.aup = com.iqoption.core.ext.a.dH(com.iqoption.core.ext.a.gp(str));
        this.auq = com.iqoption.core.ext.a.dH(inputItem.Mv());
    }

    public String getLabel() {
        String label = super.getLabel();
        return (((CharSequence) label).length() > 0 ? 1 : null) != null ? label : f.getString(com.iqoption.charttools.o.i.color);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public final int Ld() {
        return this.auq;
    }

    public final void setSelected(int i) {
        if (this.auq != i) {
            this.auq = i;
            onChanged();
        }
    }

    public boolean isDefault() {
        return this.aup == this.auq;
    }

    public InputItem La() {
        return InputItem.a(Lr(), null, null, String.valueOf(com.iqoption.core.ext.a.dG(this.auq)), null, null, null, null, false, 251, null);
    }

    public d Lb() {
        return new i(Jf().intValue(), getGid(), Lq(), getDefault(), Ls());
    }
}
