package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class aif extends bsr {
    public int scene;
    public LinkedList<String> wor = new LinkedList();

    public aif() {
        AppMethodBeat.i(89092);
        AppMethodBeat.o(89092);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(89093);
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.e(2, 1, this.wor);
            aVar.iz(3, this.scene);
            AppMethodBeat.o(89093);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            int c = (ix + e.a.a.a.c(2, 1, this.wor)) + e.a.a.b.b.a.bs(3, this.scene);
            AppMethodBeat.o(89093);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wor.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(89093);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            aif aif = (aif) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = aVar3.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        hl hlVar = new hl();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aif.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(89093);
                    return 0;
                case 2:
                    aif.wor.add(aVar3.BTU.readString());
                    AppMethodBeat.o(89093);
                    return 0;
                case 3:
                    aif.scene = aVar3.BTU.vd();
                    AppMethodBeat.o(89093);
                    return 0;
                default:
                    AppMethodBeat.o(89093);
                    return -1;
            }
        } else {
            AppMethodBeat.o(89093);
            return -1;
        }
    }
}
