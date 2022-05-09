public class Main {
    static boolean isPalindrome(int number) {
        int temp = number, reversedNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastNumber;
            temp /= 10;
        }
        return number == reversedNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(9889));
    }
}
