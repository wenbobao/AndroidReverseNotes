package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import e.a.a.b;
import java.util.LinkedList;

public final class bvg extends a {
    public long vQd;
    public axy wDI;
    public int wWo;
    public LinkedList<cmg> wWp = new LinkedList();
    public String wol;

    public bvg() {
        AppMethodBeat.i(124353);
        AppMethodBeat.o(124353);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(124354);
        b bVar;
        int o;
        byte[] bArr;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.wol == null) {
                bVar = new b("Not all required fields were included: KeyWord");
                AppMethodBeat.o(124354);
                throw bVar;
            }
            aVar.ai(1, this.vQd);
            if (this.wol != null) {
                aVar.e(2, this.wol);
            }
            if (this.wDI != null) {
                aVar.iy(3, this.wDI.computeSize());
                this.wDI.writeFields(aVar);
            }
            aVar.iz(4, this.wWo);
            aVar.e(5, 8, this.wWp);
            AppMethodBeat.o(124354);
            return 0;
        } else if (i == 1) {
            o = e.a.a.b.b.a.o(1, this.vQd) + 0;
            if (this.wol != null) {
                o += e.a.a.b.b.a.f(2, this.wol);
            }
            if (this.wDI != null) {
                o += e.a.a.a.ix(3, this.wDI.computeSize());
            }
            o = (o + e.a.a.b.b.a.bs(4, this.wWo)) + e.a.a.a.c(5, 8, this.wWp);
            AppMethodBeat.o(124354);
            return o;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wWp.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (o = a.getNextFieldNumber(aVar2); o > 0; o = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, o)) {
                    aVar2.ems();
                }
            }
            if (this.wol == null) {
                bVar = new b("Not all required fields were included: KeyWord");
                AppMethodBeat.o(124354);
                throw bVar;
            }
            AppMethodBeat.o(124354);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bvg bvg = (bvg) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    bvg.vQd = aVar3.BTU.ve();
                    AppMethodBeat.o(124354);
                    return 0;
                case 2:
                    bvg.wol = aVar3.BTU.readString();
                    AppMethodBeat.o(124354);
                    return 0;
                case 3:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        axy axy = new axy();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = axy.populateBuilderWithField(aVar4, axy, a.getNextFieldNumber(aVar4))) {
                        }
                        bvg.wDI = axy;
                    }
                    AppMethodBeat.o(124354);
                    return 0;
                case 4:
                    bvg.wWo = aVar3.BTU.vd();
                    AppMethodBeat.o(124354);
                    return 0;
                case 5:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cmg cmg = new cmg();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = cmg.populateBuilderWithField(aVar4, cmg, a.getNextFieldNumber(aVar4))) {
                        }
                        bvg.wWp.add(cmg);
                    }
                    AppMethodBeat.o(124354);
                    return 0;
                default:
                    AppMethodBeat.o(124354);
                    return -1;
            }
        } else {
            AppMethodBeat.o(124354);
            return -1;
        }
    }
}
