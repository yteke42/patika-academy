import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double per_km = 2.2;
        
        double açılış = 10;

        System.out.print("Kaç km gidildi: ");
        double gidilen_km = scanner.nextDouble();

        double tutar = açılış + (gidilen_km * per_km);

        double final_tutar = (tutar >20) ? tutar : 20;

        System.out.println("Tutar: "+final_tutar+" tl.");


        scanner.close();
    }
}
