package com.google.android.gms.internal.auth-api-phone;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class zzb extends Binder implements IInterface {
    private static zzd zzc = null;

    protected zzb(String str) {
        AppMethodBeat.i(80426);
        attachInterface(this, str);
        AppMethodBeat.o(80426);
    }

    public IBinder asBinder() {
        return this;
    }

    /* Access modifiers changed, original: protected */
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean onTransact;
        AppMethodBeat.i(80427);
        if (i > 16777215) {
            onTransact = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            onTransact = false;
        }
        if (onTransact) {
            AppMethodBeat.o(80427);
            return true;
        }
        onTransact = dispatchTransaction(i, parcel, parcel2, i2);
        AppMethodBeat.o(80427);
        return onTransact;
    }
}
