package p032c.p033a.p035b.p037b;

import android.os.Environment;
import com.facebook.common.time.C1263a;
import com.facebook.common.time.C1265c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p032c.p033a.p034a.C0650a;
import p032c.p033a.p034a.C0651b;
import p032c.p033a.p035b.p036a.C0652a;
import p032c.p033a.p035b.p036a.C0652a.C0653a;
import p032c.p033a.p035b.p036a.C0663j;
import p032c.p033a.p035b.p037b.C0678h.C0679a;
import p032c.p033a.p035b.p037b.C0678h.C0680b;
import p032c.p033a.p038c.p041c.C0700a;
import p032c.p033a.p038c.p041c.C0701b;
import p032c.p033a.p038c.p041c.C0702c;
import p032c.p033a.p038c.p041c.C0702c.C0703a;
import p032c.p033a.p038c.p041c.C0702c.C0705c;
import p032c.p033a.p038c.p041c.C0702c.C0706d;
import p032c.p033a.p038c.p042d.C0709c;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.b.b.b */
public class C0665b implements C0678h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Class<?> f2485a = C0665b.class;

    /* renamed from: b */
    static final long f2486b = TimeUnit.MINUTES.toMillis(30);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final File f2487c;

    /* renamed from: d */
    private final boolean f2488d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final File f2489e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C0652a f2490f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1263a f2491g = C1265c.m5447a();

    /* renamed from: c.a.b.b.b$a */
    private class C0666a implements C0701b {

        /* renamed from: a */
        private final List<C0679a> f2492a;

        private C0666a() {
            this.f2492a = new ArrayList();
        }

        /* renamed from: a */
        public List<C0679a> mo3372a() {
            return Collections.unmodifiableList(this.f2492a);
        }

        /* renamed from: a */
        public void mo3373a(File file) {
            C0668c a = C0665b.this.m3068b(file);
            if (a != null && a.f2498a == ".cnt") {
                this.f2492a.add(new C0667b(a.f2499b, file));
            }
        }

        /* renamed from: b */
        public void mo3374b(File file) {
        }

        /* renamed from: c */
        public void mo3375c(File file) {
        }
    }

    /* renamed from: c.a.b.b.b$b */
    static class C0667b implements C0679a {

        /* renamed from: a */
        private final String f2494a;

        /* renamed from: b */
        private final C0651b f2495b;

        /* renamed from: c */
        private long f2496c;

        /* renamed from: d */
        private long f2497d;

        private C0667b(String str, File file) {
            C0718j.m3240a(file);
            C0718j.m3240a(str);
            this.f2494a = str;
            this.f2495b = C0651b.m3026a(file);
            this.f2496c = -1;
            this.f2497d = -1;
        }

        /* renamed from: a */
        public long mo3376a() {
            if (this.f2496c < 0) {
                this.f2496c = this.f2495b.size();
            }
            return this.f2496c;
        }

        /* renamed from: b */
        public long mo3377b() {
            if (this.f2497d < 0) {
                this.f2497d = this.f2495b.mo3340b().lastModified();
            }
            return this.f2497d;
        }

        /* renamed from: c */
        public C0651b mo3378c() {
            return this.f2495b;
        }

        public String getId() {
            return this.f2494a;
        }
    }

    /* renamed from: c.a.b.b.b$c */
    private static class C0668c {

        /* renamed from: a */
        public final String f2498a;

        /* renamed from: b */
        public final String f2499b;

        private C0668c(String str, String str2) {
            this.f2498a = str;
            this.f2499b = str2;
        }

        /* renamed from: b */
        public static C0668c m3095b(File file) {
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf <= 0) {
                return null;
            }
            String a = C0665b.m3071c(name.substring(lastIndexOf));
            if (a == null) {
                return null;
            }
            String substring = name.substring(0, lastIndexOf);
            if (a.equals(".tmp")) {
                int lastIndexOf2 = substring.lastIndexOf(46);
                if (lastIndexOf2 <= 0) {
                    return null;
                }
                substring = substring.substring(0, lastIndexOf2);
            }
            return new C0668c(a, substring);
        }

        /* renamed from: a */
        public File mo3380a(File file) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2499b);
            sb.append(".");
            return File.createTempFile(sb.toString(), ".tmp", file);
        }

        /* renamed from: a */
        public String mo3381a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            sb.append(this.f2499b);
            sb.append(this.f2498a);
            return sb.toString();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2498a);
            sb.append("(");
            sb.append(this.f2499b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: c.a.b.b.b$d */
    private static class C0669d extends IOException {

        /* renamed from: a */
        public final long f2500a;

        /* renamed from: b */
        public final long f2501b;

        public C0669d(long j, long j2) {
            StringBuilder sb = new StringBuilder();
            sb.append("File was not written completely. Expected: ");
            sb.append(j);
            sb.append(", found: ");
            sb.append(j2);
            super(sb.toString());
            this.f2500a = j;
            this.f2501b = j2;
        }
    }

    /* renamed from: c.a.b.b.b$e */
    class C0670e implements C0680b {

        /* renamed from: a */
        private final String f2502a;

        /* renamed from: b */
        final File f2503b;

        public C0670e(String str, File file) {
            this.f2502a = str;
            this.f2503b = file;
        }

        /* renamed from: a */
        public C0650a mo3383a(Object obj) {
            C0653a aVar;
            File b = C0665b.this.mo3365b(this.f2502a);
            try {
                C0702c.m3219a(this.f2503b, b);
                if (b.exists()) {
                    b.setLastModified(C0665b.this.f2491g.now());
                }
                return C0651b.m3026a(b);
            } catch (C0706d e) {
                Throwable cause = e.getCause();
                if (cause != null) {
                    if (cause instanceof C0705c) {
                        aVar = C0653a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                    } else if (cause instanceof FileNotFoundException) {
                        aVar = C0653a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
                    }
                    C0665b.this.f2490f.mo3343a(aVar, C0665b.f2485a, "commit", e);
                    throw e;
                }
                aVar = C0653a.WRITE_RENAME_FILE_OTHER;
                C0665b.this.f2490f.mo3343a(aVar, C0665b.f2485a, "commit", e);
                throw e;
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public void mo3384a(C0663j jVar, Object obj) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f2503b);
                try {
                    C0709c cVar = new C0709c(fileOutputStream);
                    jVar.mo3361a(cVar);
                    cVar.flush();
                    long count = cVar.getCount();
                    fileOutputStream.close();
                    if (this.f2503b.length() != count) {
                        throw new C0669d(count, this.f2503b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e) {
                C0665b.this.f2490f.mo3343a(C0653a.WRITE_UPDATE_FILE_NOT_FOUND, C0665b.f2485a, "updateResource", e);
                throw e;
            }
        }

        /* renamed from: a */
        public boolean mo3385a() {
            return !this.f2503b.exists() || this.f2503b.delete();
        }
    }

    /* renamed from: c.a.b.b.b$f */
    private class C0671f implements C0701b {

        /* renamed from: a */
        private boolean f2505a;

        private C0671f() {
        }

        /* renamed from: d */
        private boolean m3101d(File file) {
            C0668c a = C0665b.this.m3068b(file);
            boolean z = false;
            if (a == null) {
                return false;
            }
            String str = a.f2498a;
            if (str == ".tmp") {
                return m3102e(file);
            }
            if (str == ".cnt") {
                z = true;
            }
            C0718j.m3247b(z);
            return true;
        }

        /* renamed from: e */
        private boolean m3102e(File file) {
            return file.lastModified() > C0665b.this.f2491g.now() - C0665b.f2486b;
        }

        /* renamed from: a */
        public void mo3373a(File file) {
            if (!this.f2505a || !m3101d(file)) {
                file.delete();
            }
        }

        /* renamed from: b */
        public void mo3374b(File file) {
            if (!this.f2505a && file.equals(C0665b.this.f2489e)) {
                this.f2505a = true;
            }
        }

        /* renamed from: c */
        public void mo3375c(File file) {
            if (!C0665b.this.f2487c.equals(file) && !this.f2505a) {
                file.delete();
            }
            if (this.f2505a && file.equals(C0665b.this.f2489e)) {
                this.f2505a = false;
            }
        }
    }

    public C0665b(File file, int i, C0652a aVar) {
        C0718j.m3240a(file);
        this.f2487c = file;
        this.f2488d = m3066a(file, aVar);
        this.f2489e = new File(this.f2487c, m3063a(i));
        this.f2490f = aVar;
        m3077f();
    }

    /* renamed from: a */
    private long m3060a(File file) {
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1;
    }

    /* renamed from: a */
    static String m3063a(int i) {
        return String.format(null, "%s.ols%d.%d", new Object[]{"v2", Integer.valueOf(100), Integer.valueOf(i)});
    }

    /* renamed from: a */
    private void m3065a(File file, String str) {
        try {
            C0702c.m3218a(file);
        } catch (C0703a e) {
            this.f2490f.mo3343a(C0653a.WRITE_CREATE_DIR, f2485a, str, e);
            throw e;
        }
    }

    /* renamed from: a */
    private static boolean m3066a(File file, C0652a aVar) {
        String str;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String file2 = externalStorageDirectory.toString();
            try {
                str = file.getCanonicalPath();
                try {
                    return str.contains(file2);
                } catch (IOException e) {
                    e = e;
                    C0653a aVar2 = C0653a.OTHER;
                    Class<?> cls = f2485a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("failed to read folder to check if external: ");
                    sb.append(str);
                    aVar.mo3343a(aVar2, cls, sb.toString(), e);
                    return false;
                }
            } catch (IOException e2) {
                e = e2;
                str = null;
                C0653a aVar22 = C0653a.OTHER;
                Class<?> cls2 = f2485a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("failed to read folder to check if external: ");
                sb2.append(str);
                aVar.mo3343a(aVar22, cls2, sb2.toString(), e);
                return false;
            }
        } catch (Exception e3) {
            aVar.mo3343a(C0653a.OTHER, f2485a, "failed to get the external storage directory!", e3);
            return false;
        }
    }

    /* renamed from: a */
    private boolean m3067a(String str, boolean z) {
        File b = mo3365b(str);
        boolean exists = b.exists();
        if (z && exists) {
            b.setLastModified(this.f2491g.now());
        }
        return exists;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C0668c m3068b(File file) {
        C0668c b = C0668c.m3095b(file);
        if (b == null) {
            return null;
        }
        if (!m3074e(b.f2499b).equals(file.getParentFile())) {
            b = null;
        }
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static String m3071c(String str) {
        String str2 = ".cnt";
        if (str2.equals(str)) {
            return str2;
        }
        String str3 = ".tmp";
        if (str3.equals(str)) {
            return str3;
        }
        return null;
    }

    /* renamed from: d */
    private String m3073d(String str) {
        C0668c cVar = new C0668c(".cnt", str);
        return cVar.mo3381a(m3076f(cVar.f2499b));
    }

    /* renamed from: e */
    private File m3074e(String str) {
        return new File(m3076f(str));
    }

    /* renamed from: f */
    private String m3076f(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2489e);
        sb.append(File.separator);
        sb.append(valueOf);
        return sb.toString();
    }

    /* renamed from: f */
    private void m3077f() {
        boolean z = true;
        if (this.f2487c.exists()) {
            if (!this.f2489e.exists()) {
                C0700a.m3214b(this.f2487c);
            } else {
                z = false;
            }
        }
        if (z) {
            try {
                C0702c.m3218a(this.f2489e);
            } catch (C0703a unused) {
                C0652a aVar = this.f2490f;
                C0653a aVar2 = C0653a.WRITE_CREATE_DIR;
                Class<?> cls = f2485a;
                StringBuilder sb = new StringBuilder();
                sb.append("version directory could not be created: ");
                sb.append(this.f2489e);
                aVar.mo3343a(aVar2, cls, sb.toString(), null);
            }
        }
    }

    /* renamed from: a */
    public long mo3362a(C0679a aVar) {
        return m3060a(((C0667b) aVar).mo3378c().mo3340b());
    }

    /* renamed from: a */
    public C0680b mo3363a(String str, Object obj) {
        C0668c cVar = new C0668c(".tmp", str);
        File e = m3074e(cVar.f2499b);
        String str2 = "insert";
        if (!e.exists()) {
            m3065a(e, str2);
        }
        try {
            return new C0670e(str, cVar.mo3380a(e));
        } catch (IOException e2) {
            this.f2490f.mo3343a(C0653a.WRITE_CREATE_TEMPFILE, f2485a, str2, e2);
            throw e2;
        }
    }

    /* renamed from: a */
    public void mo3364a() {
        C0700a.m3213a(this.f2487c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public File mo3365b(String str) {
        return new File(m3073d(str));
    }

    /* renamed from: b */
    public boolean mo3366b() {
        return this.f2488d;
    }

    /* renamed from: b */
    public boolean mo3367b(String str, Object obj) {
        return m3067a(str, false);
    }

    /* renamed from: c */
    public C0650a mo3368c(String str, Object obj) {
        File b = mo3365b(str);
        if (!b.exists()) {
            return null;
        }
        b.setLastModified(this.f2491g.now());
        return C0651b.m3026a(b);
    }

    /* renamed from: c */
    public void mo3369c() {
        C0700a.m3212a(this.f2487c, new C0671f());
    }

    /* renamed from: d */
    public List<C0679a> m3087d() {
        C0666a aVar = new C0666a();
        C0700a.m3212a(this.f2489e, aVar);
        return aVar.mo3372a();
    }

    public long remove(String str) {
        return m3060a(mo3365b(str));
    }
}
