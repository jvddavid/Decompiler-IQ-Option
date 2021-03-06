package d;

/* compiled from: UserAgent */
public class g {
    public final String fle;
    public final String flf;
    public final String flg;
    public final String mk;

    public g(String str, String str2, String str3, String str4) {
        this.mk = str;
        this.fle = str2;
        this.flf = str3;
        this.flg = str4;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (((this.mk == null || !this.mk.equals(gVar.mk)) && this.mk != gVar.mk) || (((this.fle == null || !this.fle.equals(gVar.fle)) && this.fle != gVar.fle) || (((this.flf == null || !this.flf.equals(gVar.flf)) && this.flf != gVar.flf) || ((this.flg == null || !this.flg.equals(gVar.flg)) && this.flg != gVar.flg)))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.mk == null ? 0 : this.mk.hashCode()) + (this.fle == null ? 0 : this.fle.hashCode())) + (this.flf == null ? 0 : this.flf.hashCode());
        if (this.flg != null) {
            i = this.flg.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder stringBuilder;
        String str3;
        String str4 = "{\"family\": %s, \"major\": %s, \"minor\": %s, \"patch\": %s}";
        Object[] objArr = new Object[4];
        if (this.mk == null) {
            str = "\"\"";
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append('\"');
            stringBuilder2.append(this.mk);
            stringBuilder2.append('\"');
            str = stringBuilder2.toString();
        }
        objArr[0] = str;
        if (this.fle == null) {
            str2 = "\"\"";
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append('\"');
            stringBuilder.append(this.fle);
            stringBuilder.append('\"');
            str2 = stringBuilder.toString();
        }
        objArr[1] = str2;
        if (this.flf == null) {
            str2 = "\"\"";
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append('\"');
            stringBuilder.append(this.flf);
            stringBuilder.append('\"');
            str2 = stringBuilder.toString();
        }
        objArr[2] = str2;
        if (this.flg == null) {
            str3 = "\"\"";
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append('\"');
            stringBuilder.append(this.flg);
            stringBuilder.append('\"');
            str3 = stringBuilder.toString();
        }
        objArr[3] = str3;
        return String.format(str4, objArr);
    }
}
