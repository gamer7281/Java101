import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, counter = 0, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        number = input.nextInt();

        for (int i = 0; i < number; i++) {
            if (i % 12 == 0) {
                total += i;
                counter++;
            }
        }

        System.out.println("Ortalama : " + (float) total / counter);
    }
}
