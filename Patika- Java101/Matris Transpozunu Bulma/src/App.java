public class App {

    public static void printMatris(int[][] matris, int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println(); //alt satıra gec
        }
    }


    public static int[][] transpose(int[][] matris, int n, int m){

        int[][] transpose = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[i][j] = matris[j][i];
            }
        }


        return transpose;
    }


    public static void main(String[] args) {
        
        int n=2;
        int m=3;

        int[][] yeniMatris = new int[n][m];
        yeniMatris[0][0] = 2;
        yeniMatris[0][1] = 3;
        yeniMatris[0][2] = 4;
        yeniMatris[1][0] = 5;
        yeniMatris[1][1] = 6;
        yeniMatris[1][2] = 4;


        System.out.print("Matris: \n");

        printMatris(yeniMatris, n, m);
        System.out.println();
        int[][] transpose = transpose(yeniMatris, n, m);
        
        System.out.println("Transpose: ");
        printMatris(transpose, m, n);

    }
}
