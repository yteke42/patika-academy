import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayı Giriniz :");
        int number = scanner.nextInt();
        int total = 0;

        while(number != 0){
            int son_basamak = number%10;
            number = number/10;
            total += son_basamak;
        }
        
        System.out.print("Total: "+total);
        scanner.close();
    }
}
