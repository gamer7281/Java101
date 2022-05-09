import java.util.Scanner;

public class Main {
    static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        int result = 1;
        result *= power(base, exp - 1) * base;
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int base = scan.nextInt();

        System.out.print("Üs değeri giriniz : ");
        int exp = scan.nextInt();

        System.out.println("Sonuç : " + power(base, exp));
    }
}
