import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double boy = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();

        //Kilo (kg) / Boy(m) * Boy(m)

        double kitle_endeksi = kilo / (boy*boy);

        System.out.println("Vücut Kitle İndeksiniz : "+kitle_endeksi);
        scanner.close();
    }
}
