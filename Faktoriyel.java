
import java.util.Scanner;

public class Faktoriyel {
    public static  void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int faktoriyel = 1;
            System.out.print("Bİr sayı giriniz: ");
            int sayi = scanner.nextInt();
            for(int i=1; i<= sayi; i++) {
                faktoriyel = faktoriyel * i;

            }
            System.out.println(sayi + "!=" + faktoriyel);
        }
    }
}
