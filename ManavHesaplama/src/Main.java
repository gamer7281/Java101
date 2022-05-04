import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutKg = 2.14, elmaKg = 3.67, domatesKg = 1.11, muzKg = 0.95, patlicanKg = 5, total;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        double armut = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        double elma = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        double domates = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        double muz = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double patlican = input.nextDouble();

        total = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg);
        System.out.println("Toplam Tutar : " + total);
    }
}
