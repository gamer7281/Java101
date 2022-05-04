import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword, resetPassword;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız!");
        } else {
            System.out.println("Bilgileriniz yanlış!");
            System.out.print("Şifrenizi güncellemek ister misiniz? (E|H) : ");
            resetPassword = input.nextLine();

            if (resetPassword.equals("H")) {
                System.out.println("Program sonlandı!");
                System.exit(1);
            }

            System.out.print("Yeni şifrenizi giriniz : ");
            newPassword = input.nextLine();

            if (password.equals(newPassword) || newPassword.equals("java123")) {
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            } else {
                System.out.println("Şifre oluşturuldu.");
            }
        }
    }
}
