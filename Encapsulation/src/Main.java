public class Main
{
    public static void main(String[] args) //main -psvm
    {

        //Encapsulatıon --> Data saklama
        //private --> acces modıfıer --> class ıcerıısnde değişkenlere erıselebılıyor yanı dısarıdan erısılemıyor

        Ogretmen nesne = new Ogretmen(); //nesne

        //nesne.yas = 25;
       // System.out.println(nesne.yas);
       // System.out.println(nesne.brans);
       // System.out.println(nesne.kimlik);

        nesne.setYas(25);
        nesne.setBrans("Türkçe");
        System.out.println(nesne.getBrans());
        System.out.println(nesne.getYas());

    }
}
