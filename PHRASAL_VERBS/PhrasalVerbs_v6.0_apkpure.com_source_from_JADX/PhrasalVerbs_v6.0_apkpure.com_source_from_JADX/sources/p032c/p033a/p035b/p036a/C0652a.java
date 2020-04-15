package p032c.p033a.p035b.p036a;

/* renamed from: c.a.b.a.a */
public interface C0652a {

    /* renamed from: c.a.b.a.a$a */
    public enum C0653a {
        READ_DECODE,
        READ_FILE,
        READ_FILE_NOT_FOUND,
        READ_INVALID_ENTRY,
        WRITE_ENCODE,
        WRITE_CREATE_TEMPFILE,
        WRITE_UPDATE_FILE_NOT_FOUND,
        WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND,
        WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND,
        WRITE_RENAME_FILE_OTHER,
        WRITE_CREATE_DIR,
        WRITE_CALLBACK_ERROR,
        WRITE_INVALID_ENTRY,
        DELETE_FILE,
        EVICTION,
        GENERIC_IO,
        OTHER
    }

    /* renamed from: a */
    void mo3343a(C0653a aVar, Class<?> cls, String str, Throwable th);
}
