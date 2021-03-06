package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.R;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class LoginFaceUI extends LoginHistoryUI {
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        AppMethodBeat.at(this, z);
    }

    public void onCreate(Bundle bundle) {
        AppMethodBeat.i(124911);
        super.onCreate(bundle);
        if (this.gCl) {
            AppMethodBeat.o(124911);
            return;
        }
        this.gwX = 4;
        this.gCg.setVisibility(0);
        this.gBN.setVisibility(0);
        findViewById(R.id.cqt).setEnabled(false);
        ((TextView) findViewById(R.id.cqu)).setTextColor(getResources().getColorStateList(R.color.a8m));
        ((TextView) findViewById(R.id.cqu)).setBackgroundResource(getResources().getColor(R.color.a3p));
        this.gBN.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                AppMethodBeat.i(124909);
                h.pYm.e(11557, Integer.valueOf(2));
                Intent intent = new Intent();
                intent.putExtra("k_user_name", LoginFaceUI.this.gCb);
                intent.putExtra("k_purpose", 2);
                intent.putExtra("k_need_signature", true);
                d.b(LoginFaceUI.this.mController.ylL, "facedetect", ".ui.FaceDetectUI", intent, 1025);
                AppMethodBeat.o(124909);
            }
        });
        AppMethodBeat.o(124911);
    }

    /* Access modifiers changed, original: protected|final */
    public final void aqU() {
        int i = -1;
        AppMethodBeat.i(124912);
        super.aqU();
        aqV();
        final m qVar = new q(this.gCb, this.gCk, "", 0);
        String str = "MicroMsg.LoginFaceUI";
        String str2 = "summerauth mAuthPwd len:%d content[%s] logindata.rawPsw len:%d content[%s]";
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(this.gCk == null ? -1 : this.gCk.length());
        objArr[1] = bo.anv(this.gCk);
        if (this.gBT.guf != null) {
            i = this.gBT.guf.length();
        }
        objArr[2] = Integer.valueOf(i);
        objArr[3] = bo.anv(this.gBT.guf);
        ab.d(str, str2, objArr);
        getString(R.string.tz);
        this.ehJ = com.tencent.mm.ui.base.h.b((Context) this, getString(R.string.cou), true, new OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                AppMethodBeat.i(124910);
                g.Rg().c(qVar);
                LoginFaceUI.this.aqW();
                AppMethodBeat.o(124910);
            }
        });
        g.Rg().a(qVar, 0);
        AppMethodBeat.o(124912);
    }
}
