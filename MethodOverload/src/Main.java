public class Main
{
    public static void main(String[] args)
    {

        int sonuc1 = toplama(10,50);
        System.out.println("Sonuç 1: " + sonuc1 );

        int sonuc2 = toplama(20,50,3);
        System.out.println("Sonuc 2: " + sonuc2);

    }

    //overload --> bir methodun imzası değiştirilerek aynı ısımde yenı bır method olusturulabılır
    //method imzası --> method ısmı ve parametrelerın bulundugu kısım

    public static int toplama(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }

    public static int toplama(int sayi1, int sayi2, int sayi3){
        return sayi1 + sayi2 + sayi3;
    }
}
