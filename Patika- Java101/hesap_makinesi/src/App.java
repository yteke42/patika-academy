import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int select;
        double n1,n2;
        Scanner input = new Scanner(System.in);
    
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextDouble();

        System.out.println("1-)Toplama\n2-)Çıkarma\n3-)Çarpma\n4-)Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();



        switch(select){
            case 1:
                System.out.println("Toplam: "+ (n1+n2));
            break;

            case 2:
                System.out.println("Fark: "+ (n1-n2));
            break;

            case 3:
                System.out.println("Çarpım: "+ (n1*n2));
            break;

            case 4:
                if(n2==0){
                    System.out.println("0'a bölünmez.");
                    break;
                }else{
                    System.out.println("Bölüm: "+ (n1/n2));
                }
            break;

            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyin.");
            }




        input.close();

    }
}
