package com.iqoption.videoeducation.a;

import android.support.v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.iqoption.core.ext.a;
import com.iqoption.core.ui.widget.recyclerview.a.b;
import com.iqoption.videoeducation.f;
import com.iqoption.x.R;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.h;

@i(aXC = {1, 1, 11}, aXD = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, aXE = {"Lcom/iqoption/videoeducation/component/VideoCatalogErrorViewHolder;", "Lcom/iqoption/core/ui/widget/recyclerview/viewholder/IQViewHolder;", "Lcom/iqoption/videoeducation/VideoCatalogErrorItem;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bind", "", "item", "IqOption-5.5.1_optionXRelease"})
/* compiled from: VideoCatalogErrorViewHolder.kt */
public final class c extends b<f> {
    /* renamed from: a */
    public void bb(f fVar) {
        h.e(fVar, "item");
    }

    public c(ViewGroup viewGroup) {
        h.e(viewGroup, "parent");
        super(new TextView(viewGroup.getContext()));
        View view = this.itemView;
        if (view == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) view;
        textView.setLayoutParams(new LayoutParams(-1, -1));
        textView.setGravity(17);
        View view2 = textView;
        int f = a.f(view2, R.dimen.dp16);
        textView.setPadding(f, 0, f, 0);
        textView.setText(R.string.error);
        textView.setTextColor(a.b(view2, (int) R.color.grey_blue_50));
        textView.setTextSize(0, a.e(view2, (int) R.dimen.sp16));
        textView.setTypeface(a.g(view2, R.font.medium));
    }
}
