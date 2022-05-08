import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = scan.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        int n2 = scan.nextInt();

        if (n2 > n1) {
            int t = n1;
            n1 = n2;
            n2 = t;
        }

        int k = n1, ebob = 0;
        while (k >= 1) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                break;
            }
            k--;
        }


        System.out.println("EBOB : " + ebob);

        int i = 1, ekok = 0;
        while (i <= (n1 * n2)) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
            i++;
        }

        System.out.println("EKOK : " + ekok);
    }
}
