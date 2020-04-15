package okhttp3.internal.huc;

import okhttp3.internal.http.UnrepeatableRequestBody;
import p133e.C2011g;
import p133e.C2013h;
import p133e.C2025t;
import p133e.C2026u;

final class StreamedRequestBody extends OutputStreamRequestBody implements UnrepeatableRequestBody {
    private final C2026u pipe = new C2026u(8192);

    StreamedRequestBody(long j) {
        initOutputStream(C2025t.m7755a(this.pipe.mo7174a()), j);
    }

    public void writeTo(C2013h hVar) {
        C2011g gVar = new C2011g();
        while (this.pipe.mo7175b().read(gVar, 8192) != -1) {
            hVar.write(gVar, gVar.size());
        }
    }
}
