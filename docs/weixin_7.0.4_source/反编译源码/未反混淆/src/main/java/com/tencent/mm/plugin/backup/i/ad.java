package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import e.a.a.b;

public final class ad extends a {
    public int jCA;
    public int jCB;
    public int jCD;
    public String jCx;
    public int jCy;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(18079);
        b bVar;
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.jCx == null) {
                bVar = new b("Not all required fields were included: DataID");
                AppMethodBeat.o(18079);
                throw bVar;
            }
            if (this.jCx != null) {
                aVar.e(1, this.jCx);
            }
            aVar.iz(2, this.jCy);
            aVar.iz(3, this.jCA);
            aVar.iz(4, this.jCB);
            aVar.iz(5, this.jCD);
            AppMethodBeat.o(18079);
            return 0;
        } else if (i == 1) {
            if (this.jCx != null) {
                f = e.a.a.b.b.a.f(1, this.jCx) + 0;
            } else {
                f = 0;
            }
            int bs = (((f + e.a.a.b.b.a.bs(2, this.jCy)) + e.a.a.b.b.a.bs(3, this.jCA)) + e.a.a.b.b.a.bs(4, this.jCB)) + e.a.a.b.b.a.bs(5, this.jCD);
            AppMethodBeat.o(18079);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            if (this.jCx == null) {
                bVar = new b("Not all required fields were included: DataID");
                AppMethodBeat.o(18079);
                throw bVar;
            }
            AppMethodBeat.o(18079);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            ad adVar = (ad) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    adVar.jCx = aVar3.BTU.readString();
                    AppMethodBeat.o(18079);
                    return 0;
                case 2:
                    adVar.jCy = aVar3.BTU.vd();
                    AppMethodBeat.o(18079);
                    return 0;
                case 3:
                    adVar.jCA = aVar3.BTU.vd();
                    AppMethodBeat.o(18079);
                    return 0;
                case 4:
                    adVar.jCB = aVar3.BTU.vd();
                    AppMethodBeat.o(18079);
                    return 0;
                case 5:
                    adVar.jCD = aVar3.BTU.vd();
                    AppMethodBeat.o(18079);
                    return 0;
                default:
                    AppMethodBeat.o(18079);
                    return -1;
            }
        } else {
            AppMethodBeat.o(18079);
            return -1;
        }
    }
}
