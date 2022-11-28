import java.util.Scanner;

public class HesapMakinesi {
     public static void main(String[] args) {
    
         Scanner scanner = new Scanner(System.in);

         System.out.println("*************** Hesap Makinesi ***************");
         System.out.println("1-Toplama İşlemi");
         System.out.println("2-Çıkarma İşlemi");
         System.out.println("3-Çarpma İşlemi");
         System.out.println("4-Bölme İşlemi");

        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
        String islem = scanner.nextLine();
        int a;
        int b;

        switch (islem) {
            case "1":
                System.out.println("Lütfen 1. sayıyı giriniz: ");
                a = scanner.nextInt();
                System.out.println("Lütfen 2. sayıyı giriniz: ");
                b = scanner.nextInt();
                System.out.println("Toplama işleminizin sonucu: " + (a + b));
            case "2":
                System.out.println("Lütfen 1. sayıyı giriniz: ");
                a = scanner.nextInt();
                System.out.println("Lütfen 2. sayıyı giriniz: ");
                b = scanner.nextInt();
                System.out.println("Çıkarma işleminizin sonucu: " + (a - b));
            case "3":
                System.out.println("Lütfen 1. sayıyı giriniz: ");
                a = scanner.nextInt();
                System.out.println("Lütfen 2. sayıyı giriniz: ");
                b = scanner.nextInt();
                System.out.println("Çarpma işleminizin sonucu: " + (a * b));
            case "4":
                System.out.println("Lütfen 1. sayıyı giriniz: ");
                a = scanner.nextInt();
                System.out.println("Lütfen 2. sayıyı giriniz: ");
                b = scanner.nextInt();
                System.out.println("Bölme işleminizin sonucu: " + (a / b));
        }

    }
    
}
