public class Araba implements Arac,Model
{

    //interfaceler birden fazla interface ı bir class içeirisnde mıras alabılır
    //interfacelerden nesne olusturulamaz

    //Arac nesne = new Arac();

    //abstract method mıras olarak alındıgı ıcın overrıde edılmelı

    @Override
    public void bilgi()
    {
        System.out.println("Bilgiler");
    }

    @Override
    public void modelBilgiler()
    {
        System.out.println("Modeller");
    }

}
