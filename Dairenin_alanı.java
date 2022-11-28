

class DaireninAlani {
    // Değişkenlere yapıcı fonksiyon içinde ilk değerleri verilir.
    double PI,r;

    // Parametresiz  yapıcı fonksiyon tanımı
     public DaireninAlani(){
         PI = 3.14;
         r = 4;
     }
     //Parametreli yapıcı fonksiyon tanımı

      public DaireninAlani(double x, double y){
         PI = x;
         r = y;
      }
      // ALan hesaplayan fonksiyon
     double Alan() {
         return PI*r*r;
     }
     public static void main(String[] args) {
         System.out.println("*****Test İşlemi*****");
         DaireninAlani fd = new DaireninAlani();
         DaireninAlani fd2 = new DaireninAlani(3.14,5);
         System.out.println("Yarıçapı: 4 cm olan dairenin alanı: " + fd.Alan());
         System.out.println("Yarıçapı: 5 cm olan  dairenin alanı: " + fd2.Alan());
     }
}
