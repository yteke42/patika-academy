import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Sayı: ");
        int first = scanner.nextInt();

        System.out.print("2. Sayı: ");
        int second = scanner.nextInt();

        System.out.print("3. Sayı: ");
        int third = scanner.nextInt();

        int min, mid, max;

        // Küçükten büyüğe sıralama mantığı
        if (first <= second && first <= third) {
            min = first;
            if (second <= third) {
                mid = second;
                max = third;
            } else {
                mid = third;
                max = second;
            }
        } else if (second <= first && second <= third) {
            min = second;
            if (first <= third) {
                mid = first;
                max = third;
            } else {
                mid = third;
                max = first;
            }
        } else {
            min = third;
            if (first <= second) {
                mid = first;
                max = second;
            } else {
                mid = second;
                max = first;
            }
        }

        System.out.println(min + " < " + mid + " < " + max);

        scanner.close();
    }
}
