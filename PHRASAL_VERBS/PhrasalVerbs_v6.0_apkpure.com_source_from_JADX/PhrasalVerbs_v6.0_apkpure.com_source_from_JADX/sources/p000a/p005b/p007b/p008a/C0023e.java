package p000a.p005b.p007b.p008a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p005b.p009c.p018g.p020b.C0129a;
import p000a.p005b.p009c.p018g.p020b.C0130b;
import p000a.p005b.p009c.p018g.p020b.C0131c;

/* renamed from: a.b.b.a.e */
public class C0023e {
    /* renamed from: a */
    public static Interpolator m34a(Context context, int i) {
        if (VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i);
        }
        XmlResourceParser xmlResourceParser = null;
        String str = "Can't load animation resource ID #0x";
        if (i == 17563663) {
            try {
                return new C0129a();
            } catch (XmlPullParserException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(Integer.toHexString(i));
                NotFoundException notFoundException = new NotFoundException(sb.toString());
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (IOException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(Integer.toHexString(i));
                NotFoundException notFoundException2 = new NotFoundException(sb2.toString());
                notFoundException2.initCause(e2);
                throw notFoundException2;
            } catch (Throwable th) {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
                throw th;
            }
        } else if (i == 17563661) {
            return new C0130b();
        } else {
            if (i == 17563662) {
                return new C0131c();
            }
            XmlResourceParser animation = context.getResources().getAnimation(i);
            Interpolator a = m35a(context, context.getResources(), context.getTheme(), animation);
            if (animation != null) {
                animation.close();
            }
            return a;
        }
    }

    /* renamed from: a */
    private static Interpolator m35a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser) {
        Interpolator hVar;
        int depth = xmlPullParser.getDepth();
        Interpolator interpolator = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                    String name = xmlPullParser.getName();
                    if (name.equals("linearInterpolator")) {
                        interpolator = new LinearInterpolator();
                    } else {
                        if (name.equals("accelerateInterpolator")) {
                            hVar = new AccelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("decelerateInterpolator")) {
                            hVar = new DecelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("accelerateDecelerateInterpolator")) {
                            interpolator = new AccelerateDecelerateInterpolator();
                        } else if (name.equals("cycleInterpolator")) {
                            hVar = new CycleInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateInterpolator")) {
                            hVar = new AnticipateInterpolator(context, asAttributeSet);
                        } else if (name.equals("overshootInterpolator")) {
                            hVar = new OvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateOvershootInterpolator")) {
                            hVar = new AnticipateOvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("bounceInterpolator")) {
                            interpolator = new BounceInterpolator();
                        } else if (name.equals("pathInterpolator")) {
                            hVar = new C0027h(context, asAttributeSet, xmlPullParser);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unknown interpolator name: ");
                            sb.append(xmlPullParser.getName());
                            throw new RuntimeException(sb.toString());
                        }
                        interpolator = hVar;
                    }
                }
            }
        }
        return interpolator;
    }
}
