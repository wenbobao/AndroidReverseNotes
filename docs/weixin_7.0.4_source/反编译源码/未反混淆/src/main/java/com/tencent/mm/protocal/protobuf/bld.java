package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class bld extends a {
    public int wOd;
    public int wOe;
    public String wOf;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(94549);
        int bs;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.iz(1, this.wOd);
            aVar.iz(2, this.wOe);
            if (this.wOf != null) {
                aVar.e(3, this.wOf);
            }
            AppMethodBeat.o(94549);
            return 0;
        } else if (i == 1) {
            bs = (e.a.a.b.b.a.bs(1, this.wOd) + 0) + e.a.a.b.b.a.bs(2, this.wOe);
            if (this.wOf != null) {
                bs += e.a.a.b.b.a.f(3, this.wOf);
            }
            AppMethodBeat.o(94549);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (bs = a.getNextFieldNumber(aVar2); bs > 0; bs = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, bs)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(94549);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bld bld = (bld) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    bld.wOd = aVar3.BTU.vd();
                    AppMethodBeat.o(94549);
                    return 0;
                case 2:
                    bld.wOe = aVar3.BTU.vd();
                    AppMethodBeat.o(94549);
                    return 0;
                case 3:
                    bld.wOf = aVar3.BTU.readString();
                    AppMethodBeat.o(94549);
                    return 0;
                default:
                    AppMethodBeat.o(94549);
                    return -1;
            }
        } else {
            AppMethodBeat.o(94549);
            return -1;
        }
    }
}
