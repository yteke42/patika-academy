public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Dizi : [10, 20, 20, 10, 10, 20, 5, 20]\n");
        System.out.println("Tekrar Sayıları");

        int[] myArray = {10, 20, 20, 10, 10, 20, 5, 20};
        boolean[] visited = new boolean[myArray.length]; // Aynı eleman tekrar sayılmasın 

        for (int i = 0; i < myArray.length; i++) {
            if (visited[i]) continue; // Daha önce sayıldıysa atla

            int count = 1; // En az 1 kere geçmiştir
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(myArray[i] + " sayısı " + count + " kere tekrar edildi.");
        }
    }
}