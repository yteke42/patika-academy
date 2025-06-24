import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        Integer minClosest = null; // girilen sayıdan küçük en yakın sayı
        Integer maxClosest = null; // girilen sayıdan büyük en yakın sayı

        for (int i : list) {
            if (i < number) {
                if (minClosest == null || i > minClosest) {
                    minClosest = i;
                }
            }
            if (i > number) {
                if (maxClosest == null || i < maxClosest) {
                    maxClosest = i;
                }
            }
        }

        if (minClosest != null) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + minClosest);
        } else {
            System.out.println("Girilen sayıdan küçük bir sayı bulunamadı.");
        }

        if (maxClosest != null) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + maxClosest);
        } else {
            System.out.println("Girilen sayıdan büyük bir sayı bulunamadı.");
        }
        scanner.close();
    }
}
