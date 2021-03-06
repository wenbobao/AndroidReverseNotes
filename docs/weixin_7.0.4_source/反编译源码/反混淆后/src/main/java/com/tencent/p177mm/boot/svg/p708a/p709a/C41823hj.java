package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.hj */
public final class C41823hj extends C5163c {
    private final int height = 100;
    private final int width = 100;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 100;
            case 1:
                return 100;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = C5163c.m7881h(looper);
                float[] g = C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                k = C5163c.m7876a(k2, looper);
                k.setStrokeWidth(1.0f);
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-9473160);
                a.setStrokeWidth(6.0f);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 59.0f, 0.0f, 1.0f, 38.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(0.0f, 1.9734219f);
                l.cubicTo(0.0f, 0.8835311f, 0.8835311f, 0.0f, 1.9734219f, 0.0f);
                l.lineTo(28.026579f, 0.0f);
                l.cubicTo(29.11647f, 0.0f, 30.0f, 0.8835311f, 30.0f, 1.9734219f);
                l.lineTo(30.0f, 46.026577f);
                l.cubicTo(30.0f, 47.116467f, 29.11647f, 48.0f, 28.026579f, 48.0f);
                l.lineTo(1.9734219f, 48.0f);
                l.cubicTo(0.8835311f, 48.0f, 0.0f, 47.116467f, 0.0f, 46.026577f);
                l.lineTo(0.0f, 1.9734219f);
                l.close();
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(69.0f, 35.0f);
                l.lineTo(69.0f, 15.980916f);
                l.cubicTo(69.0f, 14.886887f, 68.12216f, 14.0f, 67.02344f, 14.0f);
                l.lineTo(24.976562f, 14.0f);
                l.cubicTo(23.884937f, 14.0f, 23.0f, 14.88437f, 23.0f, 15.981961f);
                l.lineTo(23.0f, 84.018036f);
                l.cubicTo(23.0f, 85.11265f, 23.873781f, 86.0f, 24.969942f, 86.0f);
                l.lineTo(56.0f, 86.0f);
                canvas.drawPath(l, a2);
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
