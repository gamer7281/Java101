import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, alan, aci;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz : ");
        r = input.nextInt();

        System.out.print("Dairenin merkez açısını giriniz : ");
        aci = input.nextDouble();

        alan = (pi * r * r * aci) / 360;

        System.out.println("Dairenin alanı : " + alan);
    }
}
