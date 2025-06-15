import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sıcaklık Giriniz: ");
        int sıcaklık = scanner.nextInt();

        /*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. */

        if(sıcaklık>=25){
            System.out.print("Yüzme yapabilirsin.");
        }else if(sıcaklık<25 && sıcaklık>=15){
            System.out.print("Piknik yapabilirsin.");
        }else if(sıcaklık<15 && sıcaklık>=5){
            System.out.print("Sinemaya gidebilirsin.");
        }else if(sıcaklık<5){
            System.out.print("Kayak yapabilirsin.");
        }





        scanner.close();
    }
}
