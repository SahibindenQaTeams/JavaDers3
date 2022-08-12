public interface Arac
{

    int sayi = 24; //ınterface içindeki tanımlanan degısken final dır  -> degıskenın degerı degıstırılemez

    //interface içeriisnde olsuturulan method abstract methodtur

    public abstract void bilgi();

    //interface içeriisnde statıc method olsuturulabılır

    public static void deneme(){
        System.out.println("deneme");
    }

}
