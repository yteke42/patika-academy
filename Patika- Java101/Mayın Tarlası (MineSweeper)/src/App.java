import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen satır sayısını giriniz: ");
        int rows = scanner.nextInt();

        System.out.print("Lütfen sütun sayısını giriniz: ");
        int cols = scanner.nextInt();

        MineSweeper mine = new MineSweeper(rows, cols);
        mine.run();

        scanner.close();
    }
}
