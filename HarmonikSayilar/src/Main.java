import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");
        int n = scan.nextInt();
        double total = 0;

        for (int i = 1; i <= n; i++) {
            total += (1.0 / i);
        }

        System.out.println(total);
    }
}
