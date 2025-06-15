import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        System.out.print("Matematik: ");
        int math = scanner.nextInt();

        System.out.print("Fizik: ");
        int physics = scanner.nextInt();

        System.out.print("Kimya: ");
        int chem = scanner.nextInt();

        System.out.print("Türkçe: ");
        int tr = scanner.nextInt();

        System.out.print("Tarih: ");
        int history = scanner.nextInt();

        System.out.print("Müzik: ");
        int music = scanner.nextInt();
        
        double average = (math + physics + chem + tr + history +music)/6;

        System.out.println("Ortalaman: " + average + "\n");

        //Ternary Operator
        String var = (average >60) ? "Sınıfı geçti" : "Sınıfta Kaldı";
        System.out.println(var);

        scanner.close();
    }
}
