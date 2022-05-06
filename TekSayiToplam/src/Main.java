import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isOdd = false;
        int total = 0, number;

        Scanner input = new Scanner(System.in);

        while (!isOdd) {
            System.out.print("Bir sayı giriniz : ");
            number = input.nextInt();

            if (number % 2 != 0) {
                System.out.println("Toplam sonuç : " + total);
                isOdd = true;
            }

            if (number % 4 == 0) {
                total += number;
            }
        }
    }
}
