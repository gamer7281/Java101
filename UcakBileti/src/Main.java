import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance, age, type;
        double perKm = 0.10,
                ageDiscount = 1,
                typeDiscount = 1,
                total;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş) : ");
        type = input.nextInt();

        if (distance <= 0 || !(type == 1 || type == 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            System.exit(1);
        }

        if (age < 12) {
            ageDiscount = 0.5;
        } else if (age > 12 && age < 24) {
            ageDiscount = 0.9;
        } else if (age > 65) {
            ageDiscount = 0.7;
        }

        if (type == 2) {
            typeDiscount = 1.6;
        }

        total = distance * perKm * ageDiscount * typeDiscount;
        System.out.println("Toplam Tutar : " + total);
    }
}
