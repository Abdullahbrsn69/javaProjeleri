public class Constructor {
    ///---> Değişken Tanımlama İşlemleri <---\\\
    private String ayrac = new String(new char[15]).replace("\0", "-");
    private String isim, soyisim, mailAdresi,unvan;
    private int yas, maas;

    ///---> Constructor Metot Tanımlaması <---\\\
    
    public Constructor(String isim, String soyisim, String mailAdresi, String unvan, int yas, int maas){
        System.out.println(ayrac+"\n < Java Constructor Metot Kullanımı >\n"+ayrac);
        System.out.println("-> Bu konsol çıktısını constructor metot çalışması sonucu alıyoruz...");
        this.isim = isim;
        this.soyisim = soyisim;
        this.mailAdresi = mailAdresi;
        this.unvan = unvan;
        this.yas = yas;
        this.maas = maas;
    }
    ///---> Elde Ettiğimiz Verileri Ekrana Yazdırmak İçin Metot Oluşturalım <---\\\
    protected  void yazdir(){
        System.out.println("-> Çalışanın bilgileri derlenip konsol ekranına yazdırılmaya hazırlanıyor...\n"+ayrac);
        System.out.println("-> Çalışanın Adı: " + isim+"\n-> Çalışanın Soyismi: "+ soyisim+"\n-> Çalışanın Yaşı: " + yas);
        System.out.println("-> Çalışanın Unvanı: " + unvan + "\n-> Çalışanın Mail Adresi: "+ mailAdresi);
        System.out.println("-> Çalışanın Maaşı: " + maas + " TL\n"+ayrac);
    }
}