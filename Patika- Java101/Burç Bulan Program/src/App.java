import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğduğunuz Ay: ");
        int ay = scanner.nextInt();

        System.out.print("Doğduğunuz Gün: ");
        int gün = scanner.nextInt();

        if(ay == 1){
            if(gün <= 21){
                System.out.print("Oğlak Burcu.");
            } else {
                System.out.print("Kova Burcu.");
            }
        } else if(ay == 2){
            if(gün <= 19){
                System.out.print("Kova Burcu.");
            } else {
                System.out.print("Balık Burcu.");
            }
        } else if(ay == 3){
            if(gün <= 20){
                System.out.print("Balık Burcu.");
            } else {
                System.out.print("Koç Burcu.");
            }
        } else if(ay == 4){
            if(gün <= 20){
                System.out.print("Koç Burcu.");
            } else {
                System.out.print("Boğa Burcu.");
            }
        } else if(ay == 5){
            if(gün <= 21){
                System.out.print("Boğa Burcu.");
            } else {
                System.out.print("İkizler Burcu.");
            }
        } else if(ay == 6){
            if(gün <= 22){
                System.out.print("İkizler Burcu.");
            } else {
                System.out.print("Yengeç Burcu.");
            }
        } else if(ay == 7){
            if(gün <= 22){
                System.out.print("Yengeç Burcu.");
            } else {
                System.out.print("Aslan Burcu.");
            }
        } else if(ay == 8){
            if(gün <= 22){
                System.out.print("Aslan Burcu.");
            } else {
                System.out.print("Başak Burcu.");
            }
        } else if(ay == 9){
            if(gün <= 22){
                System.out.print("Başak Burcu.");
            } else {
                System.out.print("Terazi Burcu.");
            }
        } else if(ay == 10){
            if(gün <= 22){
                System.out.print("Terazi Burcu.");
            } else {
                System.out.print("Akrep Burcu.");
            }
        } else if(ay == 11){
            if(gün <= 21){
                System.out.print("Akrep Burcu.");
            } else {
                System.out.print("Yay Burcu.");
            }
        } else if(ay == 12){
            if(gün <= 21){
                System.out.print("Yay Burcu.");
            } else {
                System.out.print("Oğlak Burcu.");
            }
        } else {
            System.out.println("Hatalı ay girişi!");
        }

        scanner.close();
    }
}
