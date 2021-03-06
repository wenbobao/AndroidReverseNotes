package com.tencent.wework.api.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wework.api.model.WWMediaMessage.WWMediaObject;
import java.util.ArrayList;
import java.util.List;

public class WWMediaMergedConvs extends WWMediaObject {
    public List<WWMediaConversation> ALH = new ArrayList();

    public WWMediaMergedConvs() {
        AppMethodBeat.i(80505);
        AppMethodBeat.o(80505);
    }

    public final boolean a(WWMediaConversation wWMediaConversation) {
        AppMethodBeat.i(80506);
        if (wWMediaConversation.checkArgs()) {
            this.ALH.add(wWMediaConversation);
            AppMethodBeat.o(80506);
            return true;
        }
        AppMethodBeat.o(80506);
        return false;
    }

    public final boolean checkArgs() {
        AppMethodBeat.i(80507);
        if (!super.checkArgs()) {
            AppMethodBeat.o(80507);
            return false;
        } else if (this.ALH == null || this.ALH.size() == 0) {
            AppMethodBeat.o(80507);
            return false;
        } else {
            boolean z;
            for (BaseMessage checkArgs : this.ALH) {
                if (!checkArgs.checkArgs()) {
                    z = false;
                    break;
                }
            }
            z = true;
            AppMethodBeat.o(80507);
            return z;
        }
    }

    public final void toBundle(Bundle bundle) {
        AppMethodBeat.i(80508);
        bundle.putInt("_wwmergedconvobject_messageslen", this.ALH.size());
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.ALH.size()) {
                bundle.putBundle("_wwmergedconvobject_messages".concat(String.valueOf(i2)), BaseMessage.b((BaseMessage) this.ALH.get(i2)));
                i = i2 + 1;
            } else {
                super.toBundle(bundle);
                AppMethodBeat.o(80508);
                return;
            }
        }
    }
}
