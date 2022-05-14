import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list);

        Scanner scan = new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");
        int n = scan.nextInt();

        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Girilen sayı : " + n);
        for (int i = 0; i < list.length; i++) {
            if (n < list[i]){
                System.out.println("Girilen sayıdan küçük ilk sayı: " + list[i-1]);
                System.out.println("Girilen sayıdan büyük ilk sayı: " + list[i]);
                break;
            }
        }
    }
}
