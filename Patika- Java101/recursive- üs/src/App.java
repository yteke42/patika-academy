import java.util.Scanner;

public class App {

    static int power(int base, int exponent) {
        if (exponent == 0)
            return 1;
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Taban değeri giriniz : ");
        int base = scan.nextInt();

        System.out.print("Üs değeri giriniz : ");
        int exponent = scan.nextInt();

        int result = power(base, exponent);
        System.out.println("Sonuç : " + result);
        scan.close();
    }
}
