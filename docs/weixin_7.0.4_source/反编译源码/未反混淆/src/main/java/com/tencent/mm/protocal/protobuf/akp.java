package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class akp extends bsr {
    public int Scene;
    public int nbk;
    public String wdO;
    public int wqg;
    public LinkedList<bbl> wqh = new LinkedList();
    public int wqi;
    public LinkedList<azc> wqj = new LinkedList();

    public akp() {
        AppMethodBeat.i(73707);
        AppMethodBeat.o(73707);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(73708);
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.iz(2, this.nbk);
            if (this.wdO != null) {
                aVar.e(3, this.wdO);
            }
            aVar.iz(4, this.wqg);
            aVar.e(5, 8, this.wqh);
            aVar.iz(6, this.wqi);
            aVar.e(7, 8, this.wqj);
            aVar.iz(8, this.Scene);
            AppMethodBeat.o(73708);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += e.a.a.b.b.a.bs(2, this.nbk);
            if (this.wdO != null) {
                ix += e.a.a.b.b.a.f(3, this.wdO);
            }
            int bs = ((((ix + e.a.a.b.b.a.bs(4, this.wqg)) + e.a.a.a.c(5, 8, this.wqh)) + e.a.a.b.b.a.bs(6, this.wqi)) + e.a.a.a.c(7, 8, this.wqj)) + e.a.a.b.b.a.bs(8, this.Scene);
            AppMethodBeat.o(73708);
            return bs;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wqh.clear();
            this.wqj.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(73708);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            akp akp = (akp) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        hl hlVar = new hl();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        akp.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(73708);
                    return 0;
                case 2:
                    akp.nbk = aVar3.BTU.vd();
                    AppMethodBeat.o(73708);
                    return 0;
                case 3:
                    akp.wdO = aVar3.BTU.readString();
                    AppMethodBeat.o(73708);
                    return 0;
                case 4:
                    akp.wqg = aVar3.BTU.vd();
                    AppMethodBeat.o(73708);
                    return 0;
                case 5:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bbl bbl = new bbl();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bbl.populateBuilderWithField(aVar4, bbl, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        akp.wqh.add(bbl);
                    }
                    AppMethodBeat.o(73708);
                    return 0;
                case 6:
                    akp.wqi = aVar3.BTU.vd();
                    AppMethodBeat.o(73708);
                    return 0;
                case 7:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        azc azc = new azc();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = azc.populateBuilderWithField(aVar4, azc, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        akp.wqj.add(azc);
                    }
                    AppMethodBeat.o(73708);
                    return 0;
                case 8:
                    akp.Scene = aVar3.BTU.vd();
                    AppMethodBeat.o(73708);
                    return 0;
                default:
                    AppMethodBeat.o(73708);
                    return -1;
            }
        } else {
            AppMethodBeat.o(73708);
            return -1;
        }
    }
}
