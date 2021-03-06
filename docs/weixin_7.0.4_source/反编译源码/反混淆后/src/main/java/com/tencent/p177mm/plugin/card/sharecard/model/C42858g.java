package com.tencent.p177mm.plugin.card.sharecard.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.network.C1902e;
import com.tencent.p177mm.network.C1918k;
import com.tencent.p177mm.network.C1929q;
import com.tencent.p177mm.p183ai.C1202f;
import com.tencent.p177mm.p183ai.C1207m;
import com.tencent.p177mm.p183ai.C7472b;
import com.tencent.p177mm.p183ai.C7472b.C1196a;
import com.tencent.p177mm.protocal.protobuf.byv;
import com.tencent.p177mm.protocal.protobuf.byw;
import com.tencent.p177mm.protocal.protobuf.byx;
import com.tencent.p177mm.protocal.protobuf.bzm;
import com.tencent.p177mm.protocal.protobuf.cdc;
import com.tencent.p177mm.sdk.platformtools.C4990ab;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.card.sharecard.model.g */
public final class C42858g extends C1207m implements C1918k {
    private final C7472b ehh;
    private C1202f ehi;
    public String kdS;
    public int kdT;
    public String kdU;

    public C42858g(int i, LinkedList<byx> linkedList, String str, String str2, bzm bzm, int i2, cdc cdc) {
        AppMethodBeat.m2504i(88033);
        C1196a c1196a = new C1196a();
        c1196a.fsJ = new byv();
        c1196a.fsK = new byw();
        c1196a.uri = "/cgi-bin/micromsg-bin/sharecarditem";
        this.ehh = c1196a.acD();
        byv byv = (byv) this.ehh.fsG.fsP;
        byv.wYd = i;
        byv.fjr = linkedList;
        byv.wSq = str;
        byv.wni = str2;
        C4990ab.m7416i("MicroMsg.NetSceneShareCardItem", "list length is " + linkedList.size());
        byv.wYe = bzm;
        byv.cME = i2;
        byv.vBy = cdc;
        AppMethodBeat.m2505o(88033);
    }

    /* renamed from: a */
    public final void mo4498a(int i, int i2, int i3, String str, C1929q c1929q, byte[] bArr) {
        AppMethodBeat.m2504i(88034);
        C4990ab.m7417i("MicroMsg.NetSceneShareCardItem", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", Integer.valueOf(902), Integer.valueOf(i2), Integer.valueOf(i3));
        byw byw;
        if (i2 == 0 && i3 == 0) {
            C4990ab.m7416i("MicroMsg.NetSceneShareCardItem", "do ShareCardItem netscene success!");
            byw = (byw) this.ehh.fsH.fsP;
            if (byw != null) {
                this.kdS = byw.kdS;
                this.kdT = byw.kdT;
                this.kdU = byw.kdU;
            }
        } else {
            byw = (byw) this.ehh.fsH.fsP;
            if (byw != null) {
                this.kdS = byw.kdS;
                this.kdT = byw.kdT;
                this.kdU = byw.kdU;
            }
        }
        this.ehi.onSceneEnd(i2, i3, str, this);
        AppMethodBeat.m2505o(88034);
    }

    public final int getType() {
        return 902;
    }

    /* renamed from: a */
    public final int mo4456a(C1902e c1902e, C1202f c1202f) {
        AppMethodBeat.m2504i(88035);
        this.ehi = c1202f;
        int a = mo4457a(c1902e, this.ehh, this);
        AppMethodBeat.m2505o(88035);
        return a;
    }
}
