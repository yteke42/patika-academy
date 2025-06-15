import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Birinci kenar: ");
        double birinci_kenar = scanner.nextDouble();

        System.out.print("İkinci kenar: ");
        double ikinci_kenar = scanner.nextDouble();

        System.out.print("Üçüncü kenar: ");
        double üçüncü_kenar = scanner.nextDouble();

        /*
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        𝑢 = (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        */

        double çevre = birinci_kenar + ikinci_kenar+üçüncü_kenar;
        double u = çevre /2;

        double alan = u * (u - birinci_kenar)* (u - ikinci_kenar) * (u - üçüncü_kenar);
        alan = Math.sqrt(alan);

        System.out.println("Alan: "+alan);

        scanner.close();
    }
}
