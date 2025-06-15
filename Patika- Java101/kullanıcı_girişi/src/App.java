import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUsername = "patika";
        String correctPassword = "java123";

        System.out.print("Kullanıcı adınız: ");
        String kullanıcıAdı = scanner.nextLine();

        System.out.print("Şifreniz: ");
        String girilenŞifre = scanner.nextLine();

        if (kullanıcıAdı.equals(correctUsername) && girilenŞifre.equals(correctPassword)) {
            System.out.println("Giriş yaptınız.");
        } else {
            System.out.println("Bilgileriniz yanlış.");

            System.out.print("Şifre sıfırlamak isterseniz 1, istemezseniz 2 yazınız: ");
            int secim = scanner.nextInt();
            scanner.nextLine(); // bu çok önemli. nextInt() sonrası boş satırı temizler

            if (secim == 1) {
                System.out.print("Yeni şifrenizi giriniz: ");
                String yeniSifre = scanner.nextLine();

                if (yeniSifre.equals(correctPassword)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }
        }

        scanner.close();
    }
}
