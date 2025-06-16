import java.util.Scanner;

public class App {

    static void pattern(int n, int original, boolean isDecreasing) {
        System.out.print(n + " ");
        
        if (n <= 0) {
            isDecreasing = false;  // Artık arttırmaya başla
        }

        if (n == original && !isDecreasing) {
            return;  // Başlangıç değerine tekrar ulaşıldıysa dur
        }

        if (isDecreasing) {
            pattern(n - 5, original, true);
        } else {
            pattern(n + 5, original, false);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        int n = scanner.nextInt();

        pattern(n, n, true);
        scanner.close();
    }
}
