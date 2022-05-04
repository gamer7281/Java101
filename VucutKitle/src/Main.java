import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int weight;
        double height, index;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = input.nextInt();

        index = weight / Math.pow(height, 2);
        System.out.println("Vücut Kitle İndeksiniz : " + index);
    }
}
