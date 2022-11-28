

class Arac {
    protected int aHiz = 0;
    private String renk = "sarı";
    private boolean durum = false;
    
    public void calis(int Hiz) {
        durum = true;
        if (durum = true) 
            aHiz = aHiz + Hiz;
        }

        public void  dur() {
            if (durum = false) {
                aHiz = 0;
                durum = false;
            }
            
        }
        public void goster() {
            System.out.println("Çalışma: " + durum + "Hiz: " + aHiz);
            System.out.println("Renk: " + renk);

        }    
        // Taksi, Arac sınıfından türetildi.
        public class Taksi extends Arac {
            public void hizliGit(){
                aHiz = aHiz + 50;
                System.out.println("Şuan ki hızı: " + aHiz);
            }
        }
        // Kamyon, Arac sınıfından türetildi.
        public class Kamyon extends Arac {
            public static void main(String [] args) {
                // Türetilmiş sınıflardan yeni nesneler üretiyoruz.
                Taksi reno = new Arac().new Taksi();
                Kamyon bmc = new Arac().new Kamyon();
               // Reno taksisi
               reno.calis(30);
               reno.goster();
                reno.hizliGit();
                //BMC kamyonu
                bmc.calis(20);
                bmc.goster();
                bmc.dur();
            }
        }

        }
     
