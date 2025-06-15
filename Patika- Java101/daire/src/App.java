import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yarıçap: ");
        double r = scanner.nextDouble();

        System.out.print("Merkez açısı: ");
        double açı = scanner.nextDouble();

        double pi = 3.14;

        // Alan : (𝜋 * (r*r) * 𝛼) / 360

        double alan = (pi* (r*r) * açı) /360;
        System.out.println("Alan: "+alan);


        scanner.close();

    }
}
