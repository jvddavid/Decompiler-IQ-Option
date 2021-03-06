package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;

public abstract class RequestBody {
    public long contentLength() {
        return -1;
    }

    public abstract MediaType contentType();

    public abstract void writeTo(BufferedSink bufferedSink);

    public static RequestBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null) {
            charset = mediaType.charset();
            if (charset == null) {
                charset = Util.UTF_8;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(mediaType);
                stringBuilder.append("; charset=utf-8");
                mediaType = MediaType.parse(stringBuilder.toString());
            }
        }
        return create(mediaType, str.getBytes(charset));
    }

    public static RequestBody create(final MediaType mediaType, final ByteString byteString) {
        return new RequestBody() {
            public MediaType contentType() {
                return mediaType;
            }

            public long contentLength() {
                return (long) byteString.size();
            }

            public void writeTo(BufferedSink bufferedSink) {
                bufferedSink.write(byteString);
            }
        };
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
        return new RequestBody() {
            public MediaType contentType() {
                return mediaType;
            }

            public long contentLength() {
                return (long) i2;
            }

            public void writeTo(BufferedSink bufferedSink) {
                bufferedSink.write(bArr, i, i2);
            }
        };
    }

    public static RequestBody create(final MediaType mediaType, final File file) {
        if (file != null) {
            return new RequestBody() {
                public MediaType contentType() {
                    return mediaType;
                }

                public long contentLength() {
                    return file.length();
                }

                public void writeTo(BufferedSink bufferedSink) {
                    Throwable th;
                    Closeable closeable = null;
                    try {
                        Closeable source = Okio.source(file);
                        try {
                            bufferedSink.writeAll(source);
                            Util.closeQuietly(source);
                        } catch (Throwable th2) {
                            th = th2;
                            closeable = source;
                            Util.closeQuietly(closeable);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        Util.closeQuietly(closeable);
                        throw th;
                    }
                }
            };
        }
        throw new NullPointerException("content == null");
    }
}
