public class App {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean asalMı = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalMı = false;
                    break;
                }
            }

            if (asalMı) {
                System.out.print(i + " ");
            }
        }
    }
}
