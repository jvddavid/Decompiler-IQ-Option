package com.google.android.gms.plus;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzr;
import com.google.android.gms.common.util.zzv;
import com.google.android.gms.plus.Plus.PlusOptions;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.zzh;
import com.google.android.gms.plus.internal.zzn;

final class zzc extends zza<zzh, PlusOptions> {
    zzc() {
    }

    public final int getPriority() {
        return 2;
    }

    public final /* synthetic */ zze zza(Context context, Looper looper, zzr zzr, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        PlusOptions plusOptions = (PlusOptions) obj;
        if (plusOptions == null) {
            plusOptions = new PlusOptions();
        }
        return new zzh(context, looper, zzr, new zzn(zzr.zzamd().name, zzv.zzc(zzr.zzamg()), (String[]) plusOptions.zzkhl.toArray(new String[0]), new String[0], context.getPackageName(), context.getPackageName(), null, new PlusCommonExtras()), connectionCallbacks, onConnectionFailedListener);
    }
}
