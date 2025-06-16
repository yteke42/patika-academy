import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibo serisi eleman sayısı: ");
        int input = scanner.nextInt();
        int a=0;
        int b=1;
        int toplam=0;
        for(int fiboNumber=0; fiboNumber<=input;fiboNumber++){
            System.out.print(toplam+" ");
            toplam= a+b;
            a=b;
            b=toplam;
        }
        scanner.close();
    }
}
