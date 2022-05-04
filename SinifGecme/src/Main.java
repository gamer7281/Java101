import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, toplamDers = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        if (!noteCheck(mat)) {
            mat = 0;
        } else {
            toplamDers++;
        }

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        if (!noteCheck(fizik)) {
            fizik = 0;
        } else {
            toplamDers++;
        }

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();
        if (!noteCheck(turkce)) {
            turkce = 0;
        } else {
            toplamDers++;
        }

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        if (!noteCheck(kimya)) {
            kimya = 0;
        } else {
            toplamDers++;
        }

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();
        if (!noteCheck(muzik)) {
            muzik = 0;
        } else {
            toplamDers++;
        }


        double average = (mat + fizik + turkce + kimya + muzik) / toplamDers;
        if (average <= 55) {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }
        System.out.println("Ortalamanız : " + average);
    }

    public static boolean noteCheck(int note) {
        return note >= 0 && note <= 100;
    }
}
