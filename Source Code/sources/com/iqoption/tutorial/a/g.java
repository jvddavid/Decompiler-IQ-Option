package com.iqoption.tutorial.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.View;
import com.iqoption.tutorial.utils.DialogOrientation;
import com.iqoption.tutorial.utils.PointerRotation;
import com.iqoption.tutorial.utils.b;
import com.iqoption.x.R;
import kotlin.i;
import kotlin.jvm.internal.h;

@i(aXC = {1, 1, 11}, aXD = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, aXE = {"Lcom/iqoption/tutorial/strategy/EducationalVideosStrategy;", "Lcom/iqoption/tutorial/strategy/TutorialStrategy;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "calculatePosition", "Lcom/iqoption/tutorial/utils/TrainingPosition;", "activity", "Landroid/app/Activity;", "pointer", "Landroid/view/View;", "dialog", "dialogOrientation", "Lcom/iqoption/tutorial/utils/DialogOrientation;", "endDelay", "", "message", "", "pointerRotation", "Lcom/iqoption/tutorial/utils/PointerRotation;", "IqOption-5.5.1_optionXRelease"})
/* compiled from: EducationalVideosStrategy.kt */
public final class g extends j {
    protected long aFN() {
        return 0;
    }

    public g(Context context) {
        h.e(context, "context");
        super(context);
    }

    public DialogOrientation aFL() {
        return DialogOrientation.CHECK_MARK_RIGHT;
    }

    public PointerRotation aFM() {
        return PointerRotation.RIGHT_TO_LEFT;
    }

    public String message() {
        String string = getContext().getString(R.string.discover_new_opportunities_with_educational_videos);
        if (string == null) {
            h.aXZ();
        }
        return string;
    }

    public b a(Activity activity, View view, View view2) {
        h.e(activity, "activity");
        h.e(view, "pointer");
        h.e(view2, "dialog");
        View a = a(activity, R.id.videoEducation);
        if (a == null) {
            return null;
        }
        Point bQ = bQ(a);
        Resources resources = getContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.dp8);
        int width = (bQ.x + a.getWidth()) - dimensionPixelOffset;
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.dp30) + width;
        float height = (((float) bQ.y) + (((float) a.getHeight()) / 2.0f)) - (((float) view.getHeight()) * 0.44f);
        int i = (int) height;
        return new b(new Point(width, i), new Point(dimensionPixelOffset2, i), new Point((view.getWidth() + dimensionPixelOffset2) - dimensionPixelOffset, i));
    }
}
