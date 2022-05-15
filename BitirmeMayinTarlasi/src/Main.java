import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m, n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz : ");
        m = scan.nextInt();
        if (m <= 0) {
            System.out.println("Hatalı satır sayısı girdiniz!");
            System.exit(1);
        }

        System.out.print("Sütun sayısını giriniz : ");
        n = scan.nextInt();
        if (n <= 0) {
            System.out.println("Hatalı sütun sayısı girdiniz!");
            System.exit(1);
        }

        MineSweeper mineSweeper = new MineSweeper(m, n);
        mineSweeper.run();
    }
}
