package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.GoogleApiManager.zza;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzbi implements Runnable {
    private final /* synthetic */ zza zzkk;

    zzbi(zza zza) {
        this.zzkk = zza;
    }

    public final void run() {
        AppMethodBeat.i(60837);
        zza.zzc(this.zzkk);
        AppMethodBeat.o(60837);
    }
}
