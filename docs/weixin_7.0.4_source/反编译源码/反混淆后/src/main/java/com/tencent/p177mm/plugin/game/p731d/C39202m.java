package com.tencent.p177mm.plugin.game.p731d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.plugin.game.d.m */
public final class C39202m extends C1331a {
    public String mZV;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(116993);
        int f;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.mZV != null) {
                c6093a.mo13475e(1, this.mZV);
            }
            AppMethodBeat.m2505o(116993);
            return 0;
        } else if (i == 1) {
            if (this.mZV != null) {
                f = C6091a.m9575f(1, this.mZV) + 0;
            } else {
                f = 0;
            }
            AppMethodBeat.m2505o(116993);
            return f;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (f = C1331a.getNextFieldNumber(c6086a); f > 0; f = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, f)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(116993);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C39202m c39202m = (C39202m) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    c39202m.mZV = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(116993);
                    return 0;
                default:
                    AppMethodBeat.m2505o(116993);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(116993);
            return -1;
        }
    }
}
