import java.util.Scanner;

public class App {

    static boolean isPrime(int number, int i) {
        if (number <= 1) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        if (number % i == 0) {
            return false;
        }
        return isPrime(number, i - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int number = scan.nextInt();

        if (isPrime(number, number / 2)) {
            System.out.println(number + " sayısı ASALDIR !");
        } else {
            System.out.println(number + " sayısı ASAL değildir !");
        }

        scan.close();
    }
}
