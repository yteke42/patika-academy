import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int k;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        k = scanner.nextInt();

        double toplam = 0;
        int kaç_tane = 0;

        for(int i=1; i<=k; i++){
            if(i%3==0 && i%4==0){
                toplam += i;
                kaç_tane++;
            }
        }

        double average = toplam / kaç_tane;

        System.out.print("Ortalama: "+average);

        scanner.close();
    }
}
