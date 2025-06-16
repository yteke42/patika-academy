import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kümenin eleman sayısı(n): ");
        int n = scanner.nextInt();
        System.out.print("Farklı grup sayısı (r)");
        int r = scanner.nextInt();
        //C(n,r) = n! / (r! * (n-r)!)
        double sonuc = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n-r));
        System.out.println(sonuc);
        scanner.close();
    }


    public static int  faktoriyel(int n){
        int total = 1;
        for(int i=1;i<=n; i++){
            total *= i;
        }
        return total;
    }
}
