package p032c.p033a.p098m.p111i;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: c.a.m.i.a */
public class C1216a {

    /* renamed from: a */
    private static final Pattern f3969a = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    /* renamed from: a */
    private static String m5210a(ReadableMap readableMap) {
        String str = "file";
        if (readableMap.hasKey(str) && !readableMap.isNull(str) && readableMap.getType(str) == ReadableType.String) {
            Matcher matcher = f3969a.matcher(readableMap.getString(str));
            if (matcher.find()) {
                StringBuilder sb = new StringBuilder();
                sb.append(matcher.group(1));
                sb.append(":");
                return sb.toString();
            }
        }
        return "";
    }

    /* renamed from: a */
    public static String m5211a(String str, ReadableArray readableArray) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(", stack:\n");
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            sb.append(map.getString("methodName"));
            sb.append("@");
            sb.append(m5210a(map));
            String str2 = "lineNumber";
            sb.append((!map.hasKey(str2) || map.isNull(str2) || map.getType(str2) != ReadableType.Number) ? -1 : map.getInt(str2));
            String str3 = "column";
            if (map.hasKey(str3) && !map.isNull(str3) && map.getType(str3) == ReadableType.Number) {
                sb.append(":");
                sb.append(map.getInt(str3));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
