public class Main
{
    public static void main(String[] args)
    {

        Kus nesne1 = new Kus(); //obje

       // Canlı nesne2 = new Canlı();

        //Abstract class lardan nesne OLUSTURULAMAZ

        Kedi nesne2 = new Kedi();
        nesne2.konus();

        nesne1.konus();
        nesne1.solunum();
        nesne1.bilgiYazdır();
        nesne1.okuma();
    }
}
