class Araba {
    // Sınıf değişkenleri
    private String marka;
      private String renk;
        private int motor;
          private int kapasite;

    // Üye fonksiyonlar
    public void calis (String ma, String r, int m, int k) {
        marka = ma;
          renk = r;
            motor = m;
              kapasite = k;
    }
    // Yazdırma fonksiyonu ekle... yaz()
    public void yaz(){
        System.out.println(marka+"\t"+renk+"\t"+motor+"\t"+kapasite);
    }



    // Araba sınıfından nesneler üret
    public static void main(String[] args) {
        Araba kamyon = new Araba();
            Araba taksi = new Araba();

    // Bilgir gir
        kamyon.calis("BMC", "SArı",400,4122);
            taksi.calis("Reno", "MAvi", 5000,400);

    //Ekrana yaz
        kamyon.yaz();
            taksi.yaz();
    }
}
