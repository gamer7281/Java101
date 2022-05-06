import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = scan.nextInt();
        int total = 0;

        while (number != 0) {
            total += (number % 10);
            number /= 10;
        }

        System.out.println("Basamak sayıları toplamı : " + total);
    }
}
