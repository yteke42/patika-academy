import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı: ");
        int n = scanner.nextInt();

        System.out.print("Üs olacak sayı: ");
        int k = scanner.nextInt();

        int total=1;
        for (int i = 1; i <= k; i++) {
            total *=n;
        }

        System.out.print("Sonuc: "+total);

        scanner.close();

    }
}
