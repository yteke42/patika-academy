import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int tip = scanner.nextInt();

        if (mesafe > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            double birimFiyat = 0.10;
            double normalTutar = mesafe * birimFiyat;
            double indirimliTutar = normalTutar;

            // Yaş indirimi
            if (yas < 12) {
                indirimliTutar -= normalTutar * 0.50;
            } else if (yas >= 12 && yas <= 24) {
                indirimliTutar -= normalTutar * 0.10;
            } else if (yas > 65) {
                indirimliTutar -= normalTutar * 0.30;
            }

            // Gidiş-Dönüş indirimi
            if (tip == 2) {
                indirimliTutar -= indirimliTutar * 0.20;
                indirimliTutar *= 2; // çift yön
            }

            System.out.println("Toplam Tutar = " + indirimliTutar + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        scanner.close();
    }
}
