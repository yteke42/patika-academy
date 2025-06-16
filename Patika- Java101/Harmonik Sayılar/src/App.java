import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        double n = scanner.nextDouble();
        double sonuc=0;
        for (int i = 1; i <= n; i++) {
            sonuc = sonuc +(1.0 /i);
        }

        System.out.print("Sonuç: "+sonuc);
        scanner.close();
    }
}