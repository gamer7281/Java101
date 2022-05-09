import java.util.*;

public class Main {
    public static void main(String[] args) {
        int number;
        List<Integer> numbers = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int counter = scan.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            number = scan.nextInt();
            numbers.add(number);
        }

        Collections.sort(numbers);
        System.out.println("En küçük sayı : " + numbers.get(0));
        System.out.println("En büyük sayı : " + numbers.get(numbers.size() - 1));
    }
}
