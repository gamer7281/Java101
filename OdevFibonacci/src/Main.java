import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = 0 , n2 = 1, n3 = 1, n;
        System.out.print("N sayısını giriniz : ");
        n = scan.nextInt();

        for(int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
