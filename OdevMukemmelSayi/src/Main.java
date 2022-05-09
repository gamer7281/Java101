import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && number != i) {
                total += i;
            }
        }

        if (total == number) {
            System.out.println(number + " mükemmel sayıdır.");
        } else {
            System.out.println(number + " mükemmel sayı değildir.");
        }
    }
}
