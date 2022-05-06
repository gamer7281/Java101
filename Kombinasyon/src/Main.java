import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r;
        double combination;

        Scanner scan = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını giriniz : ");
        n = scan.nextInt();

        System.out.print("Oluşturulacak grup sayısını giriniz : ");
        r = scan.nextInt();

        if (r > n) {
            System.out.println("Hatalı veri girişi yaptınız!");
            System.exit(1);
        }

        combination = factorial(n) / (float) (factorial(r) * factorial(n-r));
        System.out.println("Kombinasyon sonucu : " + combination);
    }

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }

        return number * factorial(number - 1);
    }
}
