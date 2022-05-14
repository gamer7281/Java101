import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = scan.nextInt();
        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". elemanı : ");
            list[i] = scan.nextInt();
        }

        Arrays.sort(list);

        System.out.println(Arrays.toString(list));
    }
}
