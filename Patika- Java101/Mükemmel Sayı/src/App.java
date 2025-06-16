import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        //Bir sayının kendisi hariç pozitif tam 
        //sayı çarpanları (kalansız bölen sayıların) toplamı
        //kendisine eşit olan sayıya mükemmel sayı denir.
        int total =0;
        for (int i = 1; i <= number; i++) {
            if(number%i ==0){
                total +=i;
            }
        }
        total -=number;

        if(number == total){
            System.out.print(number+" bir mükemmel sayıdır.");
        }else{
            System.out.print(number+" bir mükemmel sayı değildir.");
        }
        scanner.close();
    }
}
