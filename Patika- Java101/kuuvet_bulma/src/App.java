import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sınır Sayıyı Giriniz: ");
        int sinir = scanner.nextInt();

        System.out.println("4'ün kuvvetleri:");
        for (int i = 1; i <= sinir; i *= 4) {
            System.out.println(i);
        }

        System.out.println("\n5'in kuvvetleri:");
        for (int i = 1; i <= sinir; i *= 5) {
            System.out.println(i);
        }

        scanner.close();
    }
}
