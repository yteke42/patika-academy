import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int toplam = 0;
        int dersSayisi = 0;

        // Her ders için kullanıcıdan not alınır ve geçerli aralıkta olup olmadığı kontrol edilir.

        System.out.print("Matematik notunuzu girin: ");
        int mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            dersSayisi++;
        }

        System.out.print("Fizik notunuzu girin: ");
        int fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            dersSayisi++;
        }

        System.out.print("Türkçe notunuzu girin: ");
        int turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            dersSayisi++;
        }

        System.out.print("Kimya notunuzu girin: ");
        int kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            dersSayisi++;
        }

        System.out.print("Müzik notunuzu girin: ");
        int muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            dersSayisi++;
        }

        if (dersSayisi > 0) {
            double ortalama = (double) toplam / dersSayisi;
            System.out.println("Ortalamanız: " + ortalama);

            if (ortalama >= 55) {
                System.out.println("Tebrikler, geçtiniz!");
            } else {
                System.out.println("Maalesef, kaldınız.");
            }
        } else {
            System.out.println("Geçerli not girişi yapılmadı, ortalama hesaplanamadı.");
        }

        input.close();
    }
}
