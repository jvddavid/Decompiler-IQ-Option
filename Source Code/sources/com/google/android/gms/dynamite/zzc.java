package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.zzd;

final class zzc implements zzd {
    zzc() {
    }

    public final zzj zza(Context context, String str, zzi zzi) {
        zzj zzj = new zzj();
        zzj.zzhds = zzi.zzx(context, str);
        if (zzj.zzhds != 0) {
            zzj.zzhdu = -1;
            return zzj;
        }
        zzj.zzhdt = zzi.zzc(context, str, true);
        if (zzj.zzhdt != 0) {
            zzj.zzhdu = 1;
        }
        return zzj;
    }
}
