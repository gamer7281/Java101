import java.util.Scanner;

public class Main {
    static boolean check = true;

    static void pattern(int n, int temp) {
        System.out.print(n + " ");

        if (n <= 0) {
            check = false;
        }

        if (n == temp && !check) {
            return;
        }

        if (!check) {
            pattern(n + 5, temp);
        }

        if (n >= 0 && check) {
            pattern(n - 5, temp);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N sayısı : ");
        int n = scan.nextInt();

        pattern(n, n);
    }
}
