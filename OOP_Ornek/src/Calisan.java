public class Calisan {
    private int no;
    private String isim;
    private String soyisim;
    private double maas;
    private int tecrube;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public int getTecrube() {
        return tecrube;
    }

    public void setTecrube(int tecrube) {
        this.tecrube = tecrube;
    }

    public void calisanBilgileriGoster() {
        System.out.println("**************** Çalışan Bilgileri ****************");
        System.out.println("İsim:" + isim);
        System.out.println("Soyisim: " + soyisim);
        System.out.println("No: " + no);
        System.out.println("Tecrübe: " + tecrube);

    }

    public void zamYap(int zamDegeri) {
        System.out.println("Maaşınıza " + zamDegeri + "TL zam yapıldı");
        System.out.println("Şuanki güncel maaşınız: " + (maas + zamDegeri));

    }

    public void formatAt(String formatisim, String formatisletim) {
        System.out.println( formatisim + " şu anda " + formatisletim + " işletim sistemine format atıyor.");
    }
}
