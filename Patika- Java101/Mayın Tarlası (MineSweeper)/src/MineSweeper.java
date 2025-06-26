import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner scanner = new Scanner(System.in);
    private int rowCount;
    private int colCount;
    private String[][] mineMap;
    private String[][] board;
    private int minePlacementCounter = 0;
    private int randomRow;
    private int randomCol;
    private boolean win;
    private boolean isGameRunning;
    private int stepCounter = 0;

    public MineSweeper(int rowCount, int colCount) {
        this.rowCount = rowCount;
        this.colCount = colCount;
        this.mineMap = new String[rowCount][colCount];
        this.board = new String[rowCount][colCount];
        fillArray(this.mineMap);
        fillArray(this.board);
    }

    public void generateRandomCoordinates() {
        Random random = new Random();
        this.randomRow = random.nextInt(this.rowCount);
        this.randomCol = random.nextInt(this.colCount);
    }

    public String[][] fillArray(String[][] array) {
        for (int i = 0; i < this.rowCount; i++) {
            for (int j = 0; j < this.colCount; j++) {
                array[i][j] = "-";
            }
        }
        return array;
    }

    public boolean isAvailable(String[][] arr, String value) {
        return !arr[this.randomRow][this.randomCol].equals("*");
    }

    public void run() {
        for (int i = 0; i < this.rowCount; i++) {
            for (int j = 0; j < this.colCount; j++) {
                if (minePlacementCounter < (this.rowCount * this.colCount / 4)) {
                    generateRandomCoordinates();
                    if (isAvailable(this.board, "*")) {
                        this.mineMap[randomRow][randomCol] = "*";
                        this.board[randomRow][randomCol] = "*";
                        minePlacementCounter++;
                    }
                }
            }
        }

        printMineMap();
        fillArray(this.board);
        printBoard();
        askCoordinates();
    }

    public void askCoordinates() {
        this.isGameRunning = true;

        while (this.isGameRunning) {
            int mineCountAround = 0;
            this.stepCounter++;
            boolean validInput = false;
            int row = 0;
            int col = 0;

            while (!validInput) {
                System.out.print("Enter Row: ");
                row = scanner.nextInt();
                System.out.print("Enter Column: ");
                col = scanner.nextInt();

                if (row < 0 || row >= rowCount || col < 0 || col >= colCount) {
                    System.out.println("Invalid coordinates! Please try again.");
                } else {
                    validInput = true;
                }
            }

            System.out.println("===========================");

            if (this.mineMap[row][col].equals("*")) {
                System.out.println("BOOM! You hit a mine. Game over!");
                printMineMap();
                this.isGameRunning = false;
                break;
            }

            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    int checkRow = row + i;
                    int checkCol = col + j;
                    if (checkRow >= 0 && checkRow < rowCount && checkCol >= 0 && checkCol < colCount) {
                        if (this.mineMap[checkRow][checkCol].equals("*")) {
                            mineCountAround++;
                        }
                    }
                }
            }

            if (mineCountAround > 0) {
                this.board[row][col] = String.valueOf(mineCountAround);
            } else {
                this.board[row][col] = "0";
            }

            if (this.stepCounter == rowCount * colCount - (rowCount * colCount / 4)) {
                this.win = true;
            }

            if (this.win) {
                this.isGameRunning = false;
                System.out.println("Tebrikler! Kazandınız!");
                printBoard();
                break;
            }

            printBoard();
        }
    }

    public void printMineMap() {
        System.out.println("=== Mayınların Konumu ===");
        for (int i = 0; i < this.rowCount; i++) {
            for (int j = 0; j < this.colCount; j++) {
                System.out.print(" " + this.mineMap[i][j]);
            }
            System.out.println();
        }
        System.out.println("===========================");
        System.out.println("Mayın Tarlasına Hoşgeldin!");
    }

    public void printBoard() {
        System.out.println("=== Oyuncu Tahtası ===");
        for (int i = 0; i < this.rowCount; i++) {
            for (int j = 0; j < this.colCount; j++) {
                System.out.print(" " + this.board[i][j]);
            }
            System.out.println();
        }
    }
}
