package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class aiw extends btd {
    public bos vNh;
    public LinkedList<String> woQ = new LinkedList();

    public aiw() {
        AppMethodBeat.i(11770);
        AppMethodBeat.o(11770);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(11771);
        b bVar;
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(11771);
                throw bVar;
            } else if (this.vNh == null) {
                bVar = new b("Not all required fields were included: qy_base_resp");
                AppMethodBeat.o(11771);
                throw bVar;
            } else {
                if (this.BaseResponse != null) {
                    aVar.iy(1, this.BaseResponse.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                if (this.vNh != null) {
                    aVar.iy(2, this.vNh.computeSize());
                    this.vNh.writeFields(aVar);
                }
                aVar.e(3, 1, this.woQ);
                AppMethodBeat.o(11771);
                return 0;
            }
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.vNh != null) {
                ix += e.a.a.a.ix(2, this.vNh.computeSize());
            }
            int c = ix + e.a.a.a.c(3, 1, this.woQ);
            AppMethodBeat.o(11771);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.woQ.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(11771);
                throw bVar;
            } else if (this.vNh == null) {
                bVar = new b("Not all required fields were included: qy_base_resp");
                AppMethodBeat.o(11771);
                throw bVar;
            } else {
                AppMethodBeat.o(11771);
                return 0;
            }
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            aiw aiw = (aiw) objArr[1];
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
                        BaseResponse baseResponse = new BaseResponse();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(aVar4, baseResponse, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aiw.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(11771);
                    return 0;
                case 2:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bos bos = new bos();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bos.populateBuilderWithField(aVar4, bos, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aiw.vNh = bos;
                    }
                    AppMethodBeat.o(11771);
                    return 0;
                case 3:
                    aiw.woQ.add(aVar3.BTU.readString());
                    AppMethodBeat.o(11771);
                    return 0;
                default:
                    AppMethodBeat.o(11771);
                    return -1;
            }
        } else {
            AppMethodBeat.o(11771);
            return -1;
        }
    }
}
