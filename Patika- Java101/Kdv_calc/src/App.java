import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ürün fiyatını girin: ");
        double ürün = scanner.nextDouble();
        
        double kdv_oran = (ürün>1000) ? 0.8 : 0.18; //Fiyat 1000tl'den fazlaysa kdv oranı %8 olmalı

        double kdv_miktarı = ürün * kdv_oran;
        
        double kdvli_fiyat = kdv_miktarı + ürün;

        System.out.println("Kdv'li fiyat: "+ kdvli_fiyat);

        System.out.println("Kdv miktarı: "+ kdv_miktarı);
        

        scanner.close();
    }
}
