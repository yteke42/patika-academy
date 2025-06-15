import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);


        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5;

        System.out.print("Armut kaç kilo ? : ");
        double armut_kilo = scanner.nextDouble();

        System.out.print("Elma kaç kilo ? : ");
        double elma_kilo = scanner.nextDouble();

        System.out.print("Domates kaç kilo ? : ");
        double domates_kilo = scanner.nextDouble();

        System.out.print("Muz kaç kilo ? : ");
        double muz_kilo = scanner.nextDouble();

        System.out.print("Patlıcan kaç kilo ? : ");
        double patlıcan_kilo = scanner.nextDouble();


        double toplam = (armut*armut_kilo) + (elma*elma_kilo) + (domates*domates_kilo) + (muz * muz_kilo) + (patlıcan*patlıcan_kilo);

        System.out.println("Toplam tutar: "+ toplam+ " TL");

        scanner.close();

    }
}
