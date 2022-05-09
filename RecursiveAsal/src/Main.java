import java.util.Scanner;

public class Main {
    static boolean isPrime(int number, int i) {
        if (number <= 2) {
            return number == 2;
        }
        if (number % i == 0) {
            return false;
        }
        if (i * i > number) {
            return true;
        }
        return isPrime(number, i + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = scan.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " sayısı asaldır!");
        } else {
            System.out.println(number + " sayısı asal değildir!");
        }
    }
}
