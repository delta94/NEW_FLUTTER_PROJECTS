package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.Util;
import okhttp3.internal.tls.CertificateChainCleaner;
import p133e.C2015j;

public final class CertificatePinner {
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public Builder add(String str, String... strArr) {
            if (str != null) {
                for (String pin : strArr) {
                    this.pins.add(new Pin(str, pin));
                }
                return this;
            }
            throw new NullPointerException("pattern == null");
        }

        public CertificatePinner build() {
            return new CertificatePinner(new LinkedHashSet(this.pins), null);
        }
    }

    static final class Pin {
        private static final String WILDCARD = "*.";
        final String canonicalHostname;
        final C2015j hash;
        final String hashAlgorithm;
        final String pattern;

        Pin(String str, String str2) {
            StringBuilder sb;
            int i;
            this.pattern = str;
            String str3 = "http://";
            if (str.startsWith(WILDCARD)) {
                sb = new StringBuilder();
                sb.append(str3);
                str = str.substring(2);
            } else {
                sb = new StringBuilder();
                sb.append(str3);
            }
            sb.append(str);
            this.canonicalHostname = HttpUrl.get(sb.toString()).host();
            String str4 = "sha1/";
            if (str2.startsWith(str4)) {
                this.hashAlgorithm = str4;
                i = 5;
            } else {
                String str5 = "sha256/";
                if (str2.startsWith(str5)) {
                    this.hashAlgorithm = str5;
                    i = 7;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("pins must start with 'sha256/' or 'sha1/': ");
                    sb2.append(str2);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            this.hash = C2015j.m7717a(str2.substring(i));
            if (this.hash == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("pins must be base64: ");
                sb3.append(str2);
                throw new IllegalArgumentException(sb3.toString());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof Pin) {
                Pin pin = (Pin) obj;
                if (this.pattern.equals(pin.pattern) && this.hashAlgorithm.equals(pin.hashAlgorithm) && this.hash.equals(pin.hash)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.pattern.hashCode()) * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
            if (r11.regionMatches(false, r6, r7, 0, r7.length()) != false) goto L_0x0032;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean matches(java.lang.String r11) {
            /*
                r10 = this;
                java.lang.String r0 = r10.pattern
                java.lang.String r1 = "*."
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L_0x0033
                r0 = 46
                int r0 = r11.indexOf(r0)
                int r1 = r11.length()
                int r1 = r1 - r0
                r2 = 1
                int r1 = r1 - r2
                java.lang.String r3 = r10.canonicalHostname
                int r3 = r3.length()
                if (r1 != r3) goto L_0x0031
                r5 = 0
                int r6 = r0 + 1
                java.lang.String r7 = r10.canonicalHostname
                r8 = 0
                int r9 = r7.length()
                r4 = r11
                boolean r11 = r4.regionMatches(r5, r6, r7, r8, r9)
                if (r11 == 0) goto L_0x0031
                goto L_0x0032
            L_0x0031:
                r2 = 0
            L_0x0032:
                return r2
            L_0x0033:
                java.lang.String r0 = r10.canonicalHostname
                boolean r11 = r11.equals(r0)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.Pin.matches(java.lang.String):boolean");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.hashAlgorithm);
            sb.append(this.hash.mo7038a());
            return sb.toString();
        }
    }

    CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner2) {
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner2;
    }

    public static String pin(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder sb = new StringBuilder();
            sb.append("sha256/");
            sb.append(sha256((X509Certificate) certificate).mo7038a());
            return sb.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    static C2015j sha1(X509Certificate x509Certificate) {
        return C2015j.m7719a(x509Certificate.getPublicKey().getEncoded()).mo7045e();
    }

    static C2015j sha256(X509Certificate x509Certificate) {
        return C2015j.m7719a(x509Certificate.getPublicKey().getEncoded()).mo7047f();
    }

    public void check(String str, List<Certificate> list) {
        String str2;
        List findMatchingPins = findMatchingPins(str);
        if (!findMatchingPins.isEmpty()) {
            CertificateChainCleaner certificateChainCleaner2 = this.certificateChainCleaner;
            if (certificateChainCleaner2 != null) {
                list = certificateChainCleaner2.clean(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = findMatchingPins.size();
                C2015j jVar = null;
                C2015j jVar2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    Pin pin = (Pin) findMatchingPins.get(i2);
                    if (pin.hashAlgorithm.equals("sha256/")) {
                        if (jVar == null) {
                            jVar = sha256(x509Certificate);
                        }
                        if (pin.hash.equals(jVar)) {
                            return;
                        }
                    } else if (pin.hashAlgorithm.equals("sha1/")) {
                        if (jVar2 == null) {
                            jVar2 = sha1(x509Certificate);
                        }
                        if (pin.hash.equals(jVar2)) {
                            return;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("unsupported hashAlgorithm: ");
                        sb.append(pin.hashAlgorithm);
                        throw new AssertionError(sb.toString());
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Certificate pinning failure!");
            sb2.append("\n  Peer certificate chain:");
            int size3 = list.size();
            int i3 = 0;
            while (true) {
                str2 = "\n    ";
                if (i3 >= size3) {
                    break;
                }
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb2.append(str2);
                sb2.append(pin(x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
                i3++;
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(":");
            int size4 = findMatchingPins.size();
            for (int i4 = 0; i4 < size4; i4++) {
                Pin pin2 = (Pin) findMatchingPins.get(i4);
                sb2.append(str2);
                sb2.append(pin2);
            }
            throw new SSLPeerUnverifiedException(sb2.toString());
        }
    }

    public void check(String str, Certificate... certificateArr) {
        check(str, Arrays.asList(certificateArr));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r3.pins.equals(r4.pins) != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof okhttp3.CertificatePinner
            if (r1 == 0) goto L_0x001f
            okhttp3.internal.tls.CertificateChainCleaner r1 = r3.certificateChainCleaner
            okhttp3.CertificatePinner r4 = (okhttp3.CertificatePinner) r4
            okhttp3.internal.tls.CertificateChainCleaner r2 = r4.certificateChainCleaner
            boolean r1 = okhttp3.internal.Util.equal(r1, r2)
            if (r1 == 0) goto L_0x001f
            java.util.Set<okhttp3.CertificatePinner$Pin> r1 = r3.pins
            java.util.Set<okhttp3.CertificatePinner$Pin> r4 = r4.pins
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.equals(java.lang.Object):boolean");
    }

    /* access modifiers changed from: 0000 */
    public List<Pin> findMatchingPins(String str) {
        List<Pin> emptyList = Collections.emptyList();
        for (Pin pin : this.pins) {
            if (pin.matches(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(pin);
            }
        }
        return emptyList;
    }

    public int hashCode() {
        CertificateChainCleaner certificateChainCleaner2 = this.certificateChainCleaner;
        return ((certificateChainCleaner2 != null ? certificateChainCleaner2.hashCode() : 0) * 31) + this.pins.hashCode();
    }

    /* access modifiers changed from: 0000 */
    public CertificatePinner withCertificateChainCleaner(CertificateChainCleaner certificateChainCleaner2) {
        return Util.equal(this.certificateChainCleaner, certificateChainCleaner2) ? this : new CertificatePinner(this.pins, certificateChainCleaner2);
    }
}
