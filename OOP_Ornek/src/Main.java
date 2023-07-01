import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calisan calisan = new Calisan();
        Scanner scanner = new Scanner(System.in);

        System.out.println("***** Uygulamaya Hoşgeldiniz *****");
        System.out.println("İsminizi giriniz");
        String isim = scanner.nextLine();
        calisan.setIsim(isim);

        System.out.println("Soyisminizi giriniz");
        String soyisim = scanner.nextLine();
        calisan.setSoyisim(soyisim);

        System.out.println("Numaranızı giriniz");
        int no = 0;
        try {
            no = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sayısal değer girmelisiniz.");
            return;
        }
        calisan.setNo(no);

        System.out.println("Kaç yıllık tecrübeniz var, giriniz");
        int tecrube = 0;
        try {
            tecrube = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Sayısal değer girmelisiniz.");
            return;
        }
        calisan.setTecrube(tecrube);

        System.out.println("Maaşınızı giriniz");
        double maas = 0.0;
        try {
            maas = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ondalık değer girmelisiniz.");
            return;
        }
        calisan.setMaas(maas);

        System.out.println("Lütfen bir işlem seçiniz");
        String islemler = "1-Çalışan bilgilerini göster\n"
                + "2-Zam yap\n"
                + "3-Format at";

        System.out.println(islemler);

        int islem = 0;
        try {
            islem = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Hatalı giriş yapıldı. Sayısal bir değer bekleniyor.");
            return;
        }

        switch (islem) {
            case 1:
                calisan.calisanBilgileriGoster();
                break;

            case 2:
                System.out.println("Zam değerini giriniz");
                int zam = 0;
                try {
                    zam = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Hatalı giriş yapıldı. Sayısal bir değer bekleniyor.");
                    return;
                }
                calisan.zamYap(zam);
                break;

            case 3:
                System.out.println("Kim format atacak? İsmini giriniz");
                String formatisim = scanner.nextLine();


                System.out.println("Hangi işletim sistemine format atacak? İşletim sistemini giriniz");
                String formatisletim = scanner.nextLine();
                calisan.formatAt(formatisim, formatisletim);
        }
    }
}