import java.util.Scanner ;

public class MaksimumSayı {
     public static void main(String[] args) {
            
     Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz: ");
        int a = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int b = scanner.nextInt();
        System.out.println("Üçüncü sayıyı giriniz: ");
        int c = scanner.nextInt();
        

        int maks= 1;

        if (a >= b && a >= c) {
            maks = a;
        } else if (b >= a && b >= c) {
            maks = b;
        } else if (c >= a && c >= b) {
            maks = c;
        }
        System.out.println("En büyük sayı: " + maks);
    }
       

}
