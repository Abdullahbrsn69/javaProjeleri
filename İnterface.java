
   interface Kitap {
        int syf = 200;

        // gösterilmesi için soyut metot oluşturduk.
        void goster();

    }

    class arayuz implements Kitap { // arayüz sınıfı oluşturduk. ve kitap interface ini implement ettik.

        // arayüzün özellikileri uygulandı.
        @Override
        public void goster() {
            System.out.println("İnsan ne ile yaşar");
        }

        public static void main (String[]args) {
            // nesnelerimizi oluşturduk.
            arayuz arayuz1 = new arayuz();

            arayuz1.goster();
            System.out.println("Sayfa sayısı = " + syf);
        }
    }
    