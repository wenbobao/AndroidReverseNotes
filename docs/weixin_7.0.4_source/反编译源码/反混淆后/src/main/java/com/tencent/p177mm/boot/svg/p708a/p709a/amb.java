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
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.amb */
public final class amb extends C5163c {
    private final int height = 73;
    private final int width = 73;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 73;
            case 1:
                return 73;
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
                Paint a = C5163c.m7876a(k2, looper);
                a.setStrokeWidth(1.0f);
                canvas.save();
                float[] a2 = C5163c.m7878a(g, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 10.0f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                canvas.save();
                Paint a3 = C5163c.m7876a(k, looper);
                a3.setColor(-1);
                Path l = C5163c.m7884l(looper);
                l.moveTo(38.0109f, 48.0f);
                l.lineTo(11.027271f, 48.0f);
                l.lineTo(11.025387f, 45.0f);
                l.lineTo(38.0f, 45.0f);
                l.lineTo(38.0f, 47.72576f);
                l.cubicTo(38.0f, 47.81738f, 38.00368f, 47.908848f, 38.0109f, 48.0f);
                l.close();
                l.moveTo(42.0f, 26.2f);
                l.lineTo(42.0f, 3.2803428f);
                l.cubicTo(42.0f, 1.4627535f, 40.532845f, 0.0f, 38.723015f, 0.0f);
                l.lineTo(10.276984f, 0.0f);
                l.cubicTo(8.459347f, 0.0f, 7.0f, 1.4686595f, 7.0f, 3.2803428f);
                l.lineTo(7.0f, 25.384615f);
                l.lineTo(7.7698135f, 25.503048f);
                l.cubicTo(8.660358f, 25.640055f, 9.441465f, 26.10954f, 10.0f, 26.76999f);
                l.lineTo(10.0f, 3.0f);
                l.lineTo(39.0f, 3.0f);
                l.lineTo(39.0f, 27.69727f);
                l.cubicTo(39.574238f, 27.026283f, 40.350243f, 26.529951f, 41.205326f, 26.358934f);
                l.lineTo(42.0f, 26.2f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(a, looper);
                a3.setColor(-1);
                a3.setStrokeWidth(3.0f);
                l = C5163c.m7884l(looper);
                l.moveTo(8.0f, 20.0f);
                l.cubicTo(8.0f, 20.0f, 0.64974487f, 23.407583f, -8.881784E-14f, 24.0f);
                l.cubicTo(4.5895785E-13f, 25.344828f, -6.8270754E-14f, 49.992012f, -6.8270754E-14f, 49.992012f);
                l.cubicTo(-7.9618597E-14f, 50.54871f, 0.45007995f, 51.0f, 0.9926417f, 51.0f);
                l.lineTo(6.0f, 51.0f);
                l.cubicTo(9.251935f, 51.0f, 12.15733f, 42.483112f, 12.0f, 38.0f);
                l.cubicTo(12.904676f, 38.0f, 16.089167f, 36.990547f, 18.0f, 35.0f);
                l.cubicTo(19.561045f, 33.17274f, 20.349682f, 30.5f, 20.0f, 29.0f);
                l.cubicTo(19.357014f, 26.5f, 12.872799f, 27.450745f, 10.0f, 27.0f);
                l.cubicTo(7.2419853f, 27.450745f, 7.727435f, 22.480711f, 8.0f, 20.0f);
                l.close();
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(a, looper);
                a.setColor(-1);
                a.setStrokeWidth(3.0f);
                g = C5163c.m7878a(a2, -1.0f, 0.0f, 78.147736f, 0.0f, 1.0f, 0.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                l = C5163c.m7884l(looper);
                l.moveTo(37.0f, 20.0f);
                l.cubicTo(37.0f, 20.0f, 29.654545f, 23.407583f, 29.0f, 24.0f);
                l.cubicTo(29.0f, 25.344828f, 29.0f, 49.992012f, 29.0f, 49.992012f);
                l.cubicTo(29.0f, 50.54871f, 29.452644f, 51.0f, 29.997412f, 51.0f);
                l.lineTo(35.0f, 51.0f);
                l.cubicTo(38.32028f, 51.0f, 41.24713f, 42.483112f, 41.0f, 38.0f);
                l.cubicTo(42.0f, 38.0f, 45.208015f, 36.990547f, 47.0f, 35.0f);
                l.cubicTo(48.705536f, 33.17274f, 49.5f, 30.5f, 49.0f, 28.5f);
                l.cubicTo(48.5f, 26.5f, 41.967888f, 27.450745f, 39.0f, 27.0f);
                l.cubicTo(36.29548f, 27.450745f, 36.784515f, 22.480711f, 37.0f, 20.0f);
                l.close();
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                Paint a4 = C5163c.m7876a(k, looper);
                a4.setColor(-1);
                l = C5163c.m7884l(looper);
                l.moveTo(9.0f, 15.403345f);
                l.cubicTo(13.294594f, 17.93784f, 18.527863f, 19.69076f, 24.174742f, 19.69076f);
                l.cubicTo(30.208483f, 19.69076f, 35.769997f, 17.689432f, 40.21875f, 14.871748f);
                l.lineTo(39.116177f, 14.871748f);
                l.lineTo(39.116177f, 12.13036f);
                l.cubicTo(34.953056f, 14.432558f, 29.780018f, 16.019415f, 24.174742f, 16.019415f);
                l.cubicTo(18.464275f, 16.019415f, 13.202425f, 14.372441f, 9.0f, 12.0f);
                l.lineTo(9.0f, 15.403345f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a4);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
