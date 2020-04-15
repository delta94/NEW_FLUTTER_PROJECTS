package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.modules.i18nmanager.C1489a;
import com.facebook.react.uimanager.p121a.C1595a;
import com.facebook.react.uimanager.p121a.C1596b;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaWrap;

/* renamed from: com.facebook.react.uimanager.n */
public class C1691n extends C1570F {

    /* renamed from: v */
    private final C1692a f5044v = new C1692a(null);

    /* renamed from: com.facebook.react.uimanager.n$a */
    private static class C1692a {

        /* renamed from: a */
        float f5045a;

        /* renamed from: b */
        YogaUnit f5046b;

        private C1692a() {
        }

        /* synthetic */ C1692a(C1689m mVar) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5974a(Dynamic dynamic) {
            float f;
            YogaUnit yogaUnit;
            if (dynamic.isNull()) {
                yogaUnit = YogaUnit.UNDEFINED;
            } else {
                if (dynamic.getType() == ReadableType.String) {
                    String asString = dynamic.asString();
                    if (asString.equals("auto")) {
                        yogaUnit = YogaUnit.AUTO;
                    } else if (asString.endsWith("%")) {
                        this.f5046b = YogaUnit.PERCENT;
                        f = Float.parseFloat(asString.substring(0, asString.length() - 1));
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown value: ");
                        sb.append(asString);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    this.f5046b = YogaUnit.POINT;
                    f = C1726w.m6665a(dynamic.asDouble());
                }
                this.f5045a = f;
                return;
            }
            this.f5046b = yogaUnit;
            this.f5045a = Float.NaN;
        }
    }

    /* renamed from: i */
    private int m6545i(int i) {
        if (!C1489a.m5938a().mo5392a(mo5602p())) {
            return i;
        }
        if (i == 0) {
            return 4;
        }
        if (i != 2) {
            return i;
        }
        return 5;
    }

    @C1595a(name = "alignContent")
    public void setAlignContent(String str) {
        YogaAlign yogaAlign;
        if (!mo5596j()) {
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1881872635:
                        if (str.equals("stretch")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1720785339:
                        if (str.equals("baseline")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -1364013995:
                        if (str.equals("center")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -46581362:
                        if (str.equals("flex-start")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3005871:
                        if (str.equals("auto")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 441309761:
                        if (str.equals("space-between")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1742952711:
                        if (str.equals("flex-end")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1937124468:
                        if (str.equals("space-around")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        yogaAlign = YogaAlign.AUTO;
                        break;
                    case 1:
                        break;
                    case 2:
                        yogaAlign = YogaAlign.CENTER;
                        break;
                    case 3:
                        yogaAlign = YogaAlign.FLEX_END;
                        break;
                    case 4:
                        yogaAlign = YogaAlign.STRETCH;
                        break;
                    case 5:
                        yogaAlign = YogaAlign.BASELINE;
                        break;
                    case 6:
                        yogaAlign = YogaAlign.SPACE_BETWEEN;
                        break;
                    case 7:
                        yogaAlign = YogaAlign.SPACE_AROUND;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("invalid value for alignContent: ");
                        sb.append(str);
                        throw new JSApplicationIllegalArgumentException(sb.toString());
                }
            }
            yogaAlign = YogaAlign.FLEX_START;
            mo5629a(yogaAlign);
        }
    }

    @C1595a(name = "alignItems")
    public void setAlignItems(String str) {
        YogaAlign yogaAlign;
        if (!mo5596j()) {
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1881872635:
                        if (str.equals("stretch")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1720785339:
                        if (str.equals("baseline")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -1364013995:
                        if (str.equals("center")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -46581362:
                        if (str.equals("flex-start")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3005871:
                        if (str.equals("auto")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 441309761:
                        if (str.equals("space-between")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1742952711:
                        if (str.equals("flex-end")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1937124468:
                        if (str.equals("space-around")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        yogaAlign = YogaAlign.AUTO;
                        break;
                    case 1:
                        yogaAlign = YogaAlign.FLEX_START;
                        break;
                    case 2:
                        yogaAlign = YogaAlign.CENTER;
                        break;
                    case 3:
                        yogaAlign = YogaAlign.FLEX_END;
                        break;
                    case 4:
                        break;
                    case 5:
                        yogaAlign = YogaAlign.BASELINE;
                        break;
                    case 6:
                        yogaAlign = YogaAlign.SPACE_BETWEEN;
                        break;
                    case 7:
                        yogaAlign = YogaAlign.SPACE_AROUND;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("invalid value for alignItems: ");
                        sb.append(str);
                        throw new JSApplicationIllegalArgumentException(sb.toString());
                }
            }
            yogaAlign = YogaAlign.STRETCH;
            mo5640b(yogaAlign);
        }
    }

    @C1595a(name = "alignSelf")
    public void setAlignSelf(String str) {
        YogaAlign yogaAlign;
        if (!mo5596j()) {
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1881872635:
                        if (str.equals("stretch")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1720785339:
                        if (str.equals("baseline")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -1364013995:
                        if (str.equals("center")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -46581362:
                        if (str.equals("flex-start")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3005871:
                        if (str.equals("auto")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 441309761:
                        if (str.equals("space-between")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1742952711:
                        if (str.equals("flex-end")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1937124468:
                        if (str.equals("space-around")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        break;
                    case 1:
                        yogaAlign = YogaAlign.FLEX_START;
                        break;
                    case 2:
                        yogaAlign = YogaAlign.CENTER;
                        break;
                    case 3:
                        yogaAlign = YogaAlign.FLEX_END;
                        break;
                    case 4:
                        yogaAlign = YogaAlign.STRETCH;
                        break;
                    case 5:
                        yogaAlign = YogaAlign.BASELINE;
                        break;
                    case 6:
                        yogaAlign = YogaAlign.SPACE_BETWEEN;
                        break;
                    case 7:
                        yogaAlign = YogaAlign.SPACE_AROUND;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("invalid value for alignSelf: ");
                        sb.append(str);
                        throw new JSApplicationIllegalArgumentException(sb.toString());
                }
            }
            yogaAlign = YogaAlign.AUTO;
            mo5643c(yogaAlign);
        }
    }

    @C1595a(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f) {
        mo5651g(f);
    }

    @C1596b(defaultFloat = Float.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i, float f) {
        if (!mo5596j()) {
            mo5626a(m6545i(C1718ra.f5079a[i]), C1726w.m6668b(f));
        }
    }

    @C1595a(name = "display")
    public void setDisplay(String str) {
        YogaDisplay yogaDisplay;
        if (!mo5596j()) {
            if (str == null) {
                mo5630a(YogaDisplay.FLEX);
                return;
            }
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3145721) {
                if (hashCode == 3387192 && str.equals("none")) {
                    c = 1;
                }
            } else if (str.equals("flex")) {
                c = 0;
            }
            if (c == 0) {
                yogaDisplay = YogaDisplay.FLEX;
            } else if (c == 1) {
                yogaDisplay = YogaDisplay.NONE;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid value for display: ");
                sb.append(str);
                throw new JSApplicationIllegalArgumentException(sb.toString());
            }
            mo5630a(yogaDisplay);
        }
    }

    @C1595a(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f) {
        if (!mo5596j()) {
            super.setFlex(f);
        }
    }

    @C1595a(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (!mo5596j()) {
            this.f5044v.mo5974a(dynamic);
            int i = C1689m.f5043a[this.f5044v.f5046b.ordinal()];
            if (i == 1 || i == 2) {
                mo5646e(this.f5044v.f5045a);
            } else if (i == 3) {
                mo5624M();
            } else if (i == 4) {
                mo5649f(this.f5044v.f5045a);
            }
            dynamic.recycle();
        }
    }

    @C1595a(name = "flexDirection")
    public void setFlexDirection(String str) {
        YogaFlexDirection yogaFlexDirection;
        if (!mo5596j()) {
            if (str == null) {
                mo5631a(YogaFlexDirection.COLUMN);
                return;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1448970769:
                    if (str.equals("row-reverse")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1354837162:
                    if (str.equals("column")) {
                        c = 0;
                        break;
                    }
                    break;
                case 113114:
                    if (str.equals("row")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1272730475:
                    if (str.equals("column-reverse")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                yogaFlexDirection = YogaFlexDirection.COLUMN;
            } else if (c == 1) {
                yogaFlexDirection = YogaFlexDirection.COLUMN_REVERSE;
            } else if (c == 2) {
                yogaFlexDirection = YogaFlexDirection.ROW;
            } else if (c == 3) {
                yogaFlexDirection = YogaFlexDirection.ROW_REVERSE;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid value for flexDirection: ");
                sb.append(str);
                throw new JSApplicationIllegalArgumentException(sb.toString());
            }
            mo5631a(yogaFlexDirection);
        }
    }

    @C1595a(defaultFloat = 0.0f, name = "flexGrow")
    public void setFlexGrow(float f) {
        if (!mo5596j()) {
            super.setFlexGrow(f);
        }
    }

    @C1595a(defaultFloat = 0.0f, name = "flexShrink")
    public void setFlexShrink(float f) {
        if (!mo5596j()) {
            super.setFlexShrink(f);
        }
    }

    @C1595a(name = "flexWrap")
    public void setFlexWrap(String str) {
        YogaWrap yogaWrap;
        if (!mo5596j()) {
            if (str == null) {
                mo5636a(YogaWrap.NO_WRAP);
                return;
            }
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1039592053) {
                if (hashCode != -749527969) {
                    if (hashCode == 3657802 && str.equals("wrap")) {
                        c = 1;
                    }
                } else if (str.equals("wrap-reverse")) {
                    c = 2;
                }
            } else if (str.equals("nowrap")) {
                c = 0;
            }
            if (c == 0) {
                yogaWrap = YogaWrap.NO_WRAP;
            } else if (c == 1) {
                yogaWrap = YogaWrap.WRAP;
            } else if (c == 2) {
                yogaWrap = YogaWrap.WRAP_REVERSE;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid value for flexWrap: ");
                sb.append(str);
                throw new JSApplicationIllegalArgumentException(sb.toString());
            }
            mo5636a(yogaWrap);
        }
    }

    @C1595a(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (!mo5596j()) {
            this.f5044v.mo5974a(dynamic);
            int i = C1689m.f5043a[this.f5044v.f5046b.ordinal()];
            if (i == 1 || i == 2) {
                mo5578b(this.f5044v.f5045a);
            } else if (i == 3) {
                mo5605s();
            } else if (i == 4) {
                mo5654h(this.f5044v.f5045a);
            }
            dynamic.recycle();
        }
    }

    @C1595a(name = "justifyContent")
    public void setJustifyContent(String str) {
        YogaJustify yogaJustify;
        if (!mo5596j()) {
            if (str == null) {
                mo5632a(YogaJustify.FLEX_START);
                return;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals("center")) {
                        c = 1;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals("flex-start")) {
                        c = 0;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals("space-between")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals("flex-end")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals("space-around")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2055030478:
                    if (str.equals("space-evenly")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                yogaJustify = YogaJustify.FLEX_START;
            } else if (c == 1) {
                yogaJustify = YogaJustify.CENTER;
            } else if (c == 2) {
                yogaJustify = YogaJustify.FLEX_END;
            } else if (c == 3) {
                yogaJustify = YogaJustify.SPACE_BETWEEN;
            } else if (c == 4) {
                yogaJustify = YogaJustify.SPACE_AROUND;
            } else if (c == 5) {
                yogaJustify = YogaJustify.SPACE_EVENLY;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid value for justifyContent: ");
                sb.append(str);
                throw new JSApplicationIllegalArgumentException(sb.toString());
            }
            mo5632a(yogaJustify);
        }
    }

    @C1596b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i, Dynamic dynamic) {
        if (!mo5596j()) {
            int i2 = m6545i(C1718ra.f5080b[i]);
            this.f5044v.mo5974a(dynamic);
            int i3 = C1689m.f5043a[this.f5044v.f5046b.ordinal()];
            if (i3 == 1 || i3 == 2) {
                mo5642c(i2, this.f5044v.f5045a);
            } else if (i3 == 3) {
                mo5652g(i2);
            } else if (i3 == 4) {
                mo5644d(i2, this.f5044v.f5045a);
            }
            dynamic.recycle();
        }
    }

    @C1595a(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (!mo5596j()) {
            this.f5044v.mo5974a(dynamic);
            int i = C1689m.f5043a[this.f5044v.f5046b.ordinal()];
            if (i == 1 || i == 2) {
                mo5583c(this.f5044v.f5045a);
            } else if (i == 4) {
                mo5656i(this.f5044v.f5045a);
            }
            dynamic.recycle();
        }
    }

    @C1595a(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (!mo5596j()) {
            this.f5044v.mo5974a(dynamic);
            int i = C1689m.f5043a[this.f5044v.f5046b.ordinal()];
            if (i == 1 || i == 2) {
                mo5567a(this.f5044v.f5045a);
            } else if (i == 4) {
                mo5657j(this.f5044v.f5045a);
            }
            dynamic.recycle();
        }
    }

    @C1595a(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (!mo5596j()) {
            this.f5044v.mo5974a(dynamic);
            int i = C1689m.f5043a[this.f5044v.f5046b.ordinal()];
            if (i == 1 || i == 2) {
                mo5658k(this.f5044v.f5045a);
            } else if (i == 4) {
                mo5659l(this.f5044v.f5045a);
            }
            dynamic.recycle();
        }
    }

    @C1595a(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (!mo5596j()) {
            this.f5044v.mo5974a(dynamic);
            int i = C1689m.f5043a[this.f5044v.f5046b.ordinal()];
            if (i == 1 || i == 2) {
                mo5660m(this.f5044v.f5045a);
            } else if (i == 4) {
                mo5661n(this.f5044v.f5045a);
            }
            dynamic.recycle();
        }
    }

    @C1595a(name = "overflow")
    public void setOverflow(String str) {
        YogaOverflow yogaOverflow;
        if (!mo5596j()) {
            if (str == null) {
                mo5634a(YogaOverflow.VISIBLE);
                return;
            }
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1217487446) {
                if (hashCode != -907680051) {
                    if (hashCode == 466743410 && str.equals("visible")) {
                        c = 0;
                    }
                } else if (str.equals("scroll")) {
                    c = 2;
                }
            } else if (str.equals("hidden")) {
                c = 1;
            }
            if (c == 0) {
                yogaOverflow = YogaOverflow.VISIBLE;
            } else if (c == 1) {
                yogaOverflow = YogaOverflow.HIDDEN;
            } else if (c == 2) {
                yogaOverflow = YogaOverflow.SCROLL;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid value for overflow: ");
                sb.append(str);
                throw new JSApplicationIllegalArgumentException(sb.toString());
            }
            mo5634a(yogaOverflow);
        }
    }

    @C1596b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        if (!mo5596j()) {
            int i2 = m6545i(C1718ra.f5080b[i]);
            this.f5044v.mo5974a(dynamic);
            int i3 = C1689m.f5043a[this.f5044v.f5046b.ordinal()];
            if (i3 == 1 || i3 == 2) {
                mo5647e(i2, this.f5044v.f5045a);
            } else if (i3 == 4) {
                mo5650f(i2, this.f5044v.f5045a);
            }
            dynamic.recycle();
        }
    }

    @C1595a(name = "position")
    public void setPosition(String str) {
        YogaPositionType yogaPositionType;
        if (!mo5596j()) {
            if (str == null) {
                mo5635a(YogaPositionType.RELATIVE);
                return;
            }
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -554435892) {
                if (hashCode == 1728122231 && str.equals("absolute")) {
                    c = 1;
                }
            } else if (str.equals("relative")) {
                c = 0;
            }
            if (c == 0) {
                yogaPositionType = YogaPositionType.RELATIVE;
            } else if (c == 1) {
                yogaPositionType = YogaPositionType.ABSOLUTE;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid value for position: ");
                sb.append(str);
                throw new JSApplicationIllegalArgumentException(sb.toString());
            }
            mo5635a(yogaPositionType);
        }
    }

    @C1596b(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i, Dynamic dynamic) {
        if (!mo5596j()) {
            int i2 = m6545i(new int[]{4, 5, 0, 2, 1, 3}[i]);
            this.f5044v.mo5974a(dynamic);
            int i3 = C1689m.f5043a[this.f5044v.f5046b.ordinal()];
            if (i3 == 1 || i3 == 2) {
                mo5653g(i2, this.f5044v.f5045a);
            } else if (i3 == 4) {
                mo5655h(i2, this.f5044v.f5045a);
            }
            dynamic.recycle();
        }
    }

    @C1595a(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z) {
        super.setShouldNotifyOnLayout(z);
    }

    @C1595a(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (!mo5596j()) {
            this.f5044v.mo5974a(dynamic);
            int i = C1689m.f5043a[this.f5044v.f5046b.ordinal()];
            if (i == 1 || i == 2) {
                mo5586d(this.f5044v.f5045a);
            } else if (i == 3) {
                mo5611y();
            } else if (i == 4) {
                mo5662o(this.f5044v.f5045a);
            }
            dynamic.recycle();
        }
    }
}
