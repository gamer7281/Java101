import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Sınır Sayısını Giriniz : ");
        n = input.nextInt();

        System.out.print("4'ün katları : ");
        for (int i = 1; i <= n; i*=4) {
            System.out.print(i + " ");
        }

        System.out.println("");

        System.out.print("5'in katları : ");
        for (int j = 1; j <= n; j*=5) {
            System.out.print(j + " ");
        }
    }
}
