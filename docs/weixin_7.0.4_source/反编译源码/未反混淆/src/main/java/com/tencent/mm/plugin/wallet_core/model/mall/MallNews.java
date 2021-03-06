package com.tencent.mm.plugin.wallet_core.model.mall;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.appevents.AppEventsConstants;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MallNews implements Parcelable {
    public static final Creator<MallNews> CREATOR = new Creator<MallNews>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MallNews[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            AppMethodBeat.i(47015);
            MallNews mallNews = new MallNews(parcel);
            AppMethodBeat.o(47015);
            return mallNews;
        }
    };
    public String cxb;
    public String fsT;
    public int showType;
    public String ssr;
    public int tBn;
    public int tDA;
    public String tDB;
    public String tDC;
    public String tDt = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public String tDu = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public String tDv;
    public String tDw;
    public String tDx;
    public int tDy;
    public String tDz;
    public String type;

    public MallNews(String str) {
        this.fsT = str;
    }

    public boolean equals(Object obj) {
        AppMethodBeat.i(47016);
        if (obj instanceof MallNews) {
            MallNews mallNews = (MallNews) obj;
            if (this.fsT == null || !this.fsT.equals(mallNews.fsT)) {
                AppMethodBeat.o(47016);
                return false;
            } else if (this.ssr == null || !this.ssr.equals(mallNews.ssr)) {
                AppMethodBeat.o(47016);
                return false;
            } else {
                AppMethodBeat.o(47016);
                return true;
            }
        }
        AppMethodBeat.o(47016);
        return false;
    }

    public MallNews(Parcel parcel) {
        AppMethodBeat.i(47017);
        this.fsT = parcel.readString();
        this.ssr = parcel.readString();
        this.cxb = parcel.readString();
        this.tDv = parcel.readString();
        this.tDw = parcel.readString();
        this.tDx = parcel.readString();
        this.tDy = parcel.readInt();
        this.tDz = parcel.readString();
        this.tDt = parcel.readString();
        this.tDu = parcel.readString();
        this.showType = parcel.readInt();
        this.tDB = parcel.readString();
        this.tBn = parcel.readInt();
        this.tDC = parcel.readString();
        AppMethodBeat.o(47017);
    }

    public void writeToParcel(Parcel parcel, int i) {
        AppMethodBeat.i(47018);
        parcel.writeString(this.fsT);
        parcel.writeString(this.ssr);
        parcel.writeString(this.cxb);
        parcel.writeString(this.tDv);
        parcel.writeString(this.tDw);
        parcel.writeString(this.tDx);
        parcel.writeInt(this.tDy);
        parcel.writeString(this.tDz);
        parcel.writeString(this.tDt);
        parcel.writeString(this.tDu);
        parcel.writeInt(this.showType);
        parcel.writeString(this.tDB);
        parcel.writeInt(this.tBn);
        parcel.writeString(this.tDC);
        AppMethodBeat.o(47018);
    }

    static {
        AppMethodBeat.i(47020);
        AppMethodBeat.o(47020);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        AppMethodBeat.i(47019);
        String format = String.format("functionId : %s, activityId : %s, ticket : %s, activityMsg : %s, activityLink : %s, activityIconLink : %s, showFlag : %s, orgStr : %s, activityTips: %s, activityType: %d, activityUrl: %s", new Object[]{this.fsT, this.ssr, this.cxb, this.tDv, this.tDw, this.tDx, this.tDt, this.tDB, this.tDz, Integer.valueOf(this.tBn), this.tDC});
        AppMethodBeat.o(47019);
        return format;
    }
}
