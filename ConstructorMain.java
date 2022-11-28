public class ConstructorMain {
    public static void main(String[] args) {
        ///---> Sınıf yapısından nesne türetme işlemini gerçekleştirelim <---\\\
        Constructor constructor = new Constructor("Abdullah","Başaran","abdullah18basaran@gmail.com","Yazılım mühendisi",23,20000);
        ///---> Eklemiş olduğumuz verilerin çıktısını kontrol etmek için yazdir() metodunu çağıralım <---\\\
        constructor.yazdir();
    }
}