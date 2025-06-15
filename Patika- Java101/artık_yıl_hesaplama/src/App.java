import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        int yıl = scanner.nextInt();
        String sonuç = (yıl%4==0) ? (yıl+" bir artık yıldır!") : (yıl+ " bir artık yıl değildir!");
        System.out.println(sonuç);

        scanner.close();
    }
}