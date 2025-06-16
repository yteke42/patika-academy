import java.util.Scanner;

public class App {

    public static boolean isPalindrom(int number) {
        int temp = number;
        int reversed = 0;

        while (temp != 0) {
            int digit = temp % 10;        // son basamağı al
            reversed = reversed * 10 + digit; // tersine ekle
            temp /= 10;                   // bir basamak eksilt
        }

        return number == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int num = scanner.nextInt();

        if (isPalindrom(num)) {
            System.out.println(num + " bir palindrom sayıdır.");
        } else {
            System.out.println(num + " bir palindrom sayı değildir.");
        }

        scanner.close();
    }
}
