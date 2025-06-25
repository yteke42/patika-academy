import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu girin: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.print("Dizinin elemanlarını giriniz: ");

        for (int i = 0; i < n; i++) {
            
            System.out.print(i+1 + ". Eleman: ");
            array[i] = scanner.nextInt();
        }

        //selection sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // En küçük eleman ile yer değiş
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        System.out.print("Sıralama : ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
