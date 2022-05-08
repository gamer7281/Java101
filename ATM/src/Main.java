import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;
        Scanner scan = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı adınız : ");
            username = scan.nextLine();
            System.out.print("Parolanız : ");
            password = scan.nextLine();

            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("Mehaba, X bankasına hoşgeldiniz!");
                do {
                    System.out.println("""
                        1-Para Yatırma
                        2-Para Çekme
                        3-Bakiye Sorgula
                        4-Çıkış Yap""");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = scan.nextInt();

                    switch (select) {
                        case 1 -> {
                            System.out.print("Para miktarı : ");
                            int price = scan.nextInt();
                            balance += price;
                        }
                        case 2 -> {
                            System.out.print("Para miktarı : ");
                            int price = scan.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                        }
                        case 3 -> System.out.println("Bakiyeniz : " + balance);
                    }
                } while (select != 4);
                System.out.print("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan hakkınız : " + right);
                }
            }
        }
    }
}
