package okhttp3.internal.cache;

import java.io.IOException;
import p133e.C1999C;
import p133e.C2011g;
import p133e.C2016k;

class FaultHidingSink extends C2016k {
    private boolean hasErrors;

    FaultHidingSink(C1999C c) {
        super(c);
    }

    public void close() {
        if (!this.hasErrors) {
            try {
                super.close();
            } catch (IOException e) {
                this.hasErrors = true;
                onException(e);
            }
        }
    }

    public void flush() {
        if (!this.hasErrors) {
            try {
                super.flush();
            } catch (IOException e) {
                this.hasErrors = true;
                onException(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onException(IOException iOException) {
    }

    public void write(C2011g gVar, long j) {
        if (this.hasErrors) {
            gVar.skip(j);
            return;
        }
        try {
            super.write(gVar, j);
        } catch (IOException e) {
            this.hasErrors = true;
            onException(e);
        }
    }
}
