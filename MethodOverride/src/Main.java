public class Main
{
    public static void main(String[] args)
    {
        //override --> miras alınan methodun içeriğini değiştirerek alt classlarda kullanabılırız.

        Toyoto nesne = new Toyoto();

        nesne.hareket();
        nesne.calistir();
        nesne.bilgi();

    }
}
