import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz : ");
        tutar = input.nextDouble();

        kdvOran = tutar > 0 && tutar < 1000 ? 0.18 : 0.8;

        kdvTutar = tutar  * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar : " + tutar);
        System.out.println("KDV oranı : " + kdvOran);
        System.out.println("KDV tutar : " + kdvTutar);
        System.out.println("KDV'li tutar : " + kdvliTutar);
    }
}
