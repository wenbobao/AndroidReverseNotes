package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class bbw extends c {
    private final int height = 144;
    private final int width = 144;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 144;
            case 1:
                return 144;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                c.h(looper);
                c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                c.a(k2, looper).setStrokeWidth(1.0f);
                Paint a = c.a(k, looper);
                a.setColor(-1);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path l = c.l(looper);
                l.moveTo(72.0f, 124.8f);
                l.cubicTo(101.16064f, 124.8f, 124.8f, 101.16064f, 124.8f, 72.0f);
                l.cubicTo(124.8f, 42.839367f, 101.16064f, 19.2f, 72.0f, 19.2f);
                l.cubicTo(42.839367f, 19.2f, 19.2f, 42.839367f, 19.2f, 72.0f);
                l.cubicTo(19.2f, 101.16064f, 42.839367f, 124.8f, 72.0f, 124.8f);
                l.close();
                l.moveTo(72.0f, 132.0f);
                l.cubicTo(38.862915f, 132.0f, 12.0f, 105.137085f, 12.0f, 72.0f);
                l.cubicTo(12.0f, 38.862915f, 38.862915f, 12.0f, 72.0f, 12.0f);
                l.cubicTo(105.137085f, 12.0f, 132.0f, 38.862915f, 132.0f, 72.0f);
                l.cubicTo(132.0f, 105.137085f, 105.137085f, 132.0f, 72.0f, 132.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a = c.a(a, looper);
                l = c.l(looper);
                l.moveTo(72.0f, 106.8f);
                l.cubicTo(91.21951f, 106.8f, 106.8f, 91.21951f, 106.8f, 72.0f);
                l.cubicTo(106.8f, 52.78049f, 91.21951f, 37.2f, 72.0f, 37.2f);
                l.cubicTo(52.78049f, 37.2f, 37.2f, 52.78049f, 37.2f, 72.0f);
                l.cubicTo(37.2f, 91.21951f, 52.78049f, 106.8f, 72.0f, 106.8f);
                l.close();
                l.moveTo(72.0f, 114.0f);
                l.cubicTo(48.80404f, 114.0f, 30.0f, 95.19596f, 30.0f, 72.0f);
                l.cubicTo(30.0f, 48.80404f, 48.80404f, 30.0f, 72.0f, 30.0f);
                l.cubicTo(95.19596f, 30.0f, 114.0f, 48.80404f, 114.0f, 72.0f);
                l.cubicTo(114.0f, 95.19596f, 95.19596f, 114.0f, 72.0f, 114.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a);
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
