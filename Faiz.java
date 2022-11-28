

import java.util.Scanner;

public class Faiz {
    public static void main(String[] args) {

        // Faiz Uygulaması:
        // Kullanıcadan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği 
        //istediğini sorun ve her sene sonunda toplam para miktarını yazın...

          Scanner scanner = new Scanner(System.in);
              System.out.println("Bankamıza Hoşgeldiniz faiz oranımız %6");

          int anapara,vade ;
              System.out.println("yatırmak istediğiniz tutar: ");

          anapara = scanner.nextInt();
              System.out.println("Paranızı kaç yıl vadeli yatırmak istiyorusunuz? : ");

          vade = scanner.nextInt();

              double toplampara = anapara;
              double faizOranı = 0.06;

          for (int i = 1; i <= vade; i++) {
             toplampara = (toplampara * faizOranı) + toplampara;
                System.out.println(i + ". yılın sonunda toplam para : " + (int)toplampara);
          }


    }
}
