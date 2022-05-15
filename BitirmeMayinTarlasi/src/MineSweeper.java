import java.util.Scanner;

public class MineSweeper {
    int m;
    int n;
    String[][] mineTable;
    String[][] mineCoordinates;

    MineSweeper(int m, int n) {
        this.m = m;
        this.n = n;
    }

    void createTable() {
        this.mineTable = new String[this.m][this.n];

        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                this.mineTable[i][j] = "-";
            }
        }
    }

    void setMineCoordinates() {
        this.mineCoordinates = new String[this.m][this.n];

        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                this.mineCoordinates[i][j] = "-";
            }
        }

        int mineCount = this.m * this.n / 4;
        while (mineCount > 0) {
            int mineI = (int) (Math.random() * m);
            int mineJ = (int) (Math.random() * n);
            if (!this.mineCoordinates[mineI][mineJ].equals("*")) {
                this.mineCoordinates[mineI][mineJ] = "*";
                mineCount--;
            }
        }
    }

    void printTable(String[][] table) {
        for (String[] col: table) {
            for (String row: col) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    void run() {
        this.createTable();
        this.setMineCoordinates();

        System.out.println("Mayınların Konumu");

        printTable(this.mineCoordinates);

        System.out.println("========================");

        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");

        Scanner scan = new Scanner(System.in);

        int emptyFields = (this.m * this.n) - (this.m * this.n / 4);
        while (emptyFields > 0) {
            System.out.print("Satır Giriniz : ");
            int row = scan.nextInt();

            System.out.print("Sütun Giriniz : ");
            int col = scan.nextInt();

            if (row > this.m - 1 || col > this.n - 1) {
                System.out.println("Hatalı kordinat seçimi!");
                continue;
            }

            if (this.mineCoordinates[row][col].equals("*")) {
                System.out.println("Game Over!!");
                break;
            } else {
                int counter = 0;
                for (int i = (row - 1); i <= (row + 1); i++) {
                    for (int j = (col - 1); j <= (col + 1); j++) {
                        if ((i >= 0 && i < this.m) && (j >= 0 && j < this.n)) {
                            if (this.mineCoordinates[i][j].equals("*")) {
                                counter++;
                            }
                        }
                    }
                }
                this.mineTable[row][col] = Integer.toString(counter);
            }

            this.printTable(this.mineTable);

            System.out.println("========================");
            emptyFields--;
        }

        if (emptyFields == 0) {
            System.out.println("Oyunu Kazandınız !");
            this.printTable(this.mineTable);
        }
    }
}
