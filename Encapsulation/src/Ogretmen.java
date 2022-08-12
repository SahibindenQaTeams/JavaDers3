public class Ogretmen
{
    //değişken

    private String brans = "Matematik";
    private int yas = 30;
    private long kimlik = 12345678;


    //get methodu ile private olan bir değişkene dısarıdan erişebiliyorum

    public String getBrans(){
        return brans;
    }

    public long getKimlik()
    {
        return kimlik;
    }

    public void setKimlik(long kimlik)
    {
        this.kimlik = kimlik;
    }

    public int getYas(){
        return yas;
    }


    //set --> private olan bir değişkenin değerini değiştirebiliyorum ve dısarıdan erısebılıyorum

    public void setYas(int yas){
        this.yas = yas;
    }

    public void setBrans(String brans){
        this.brans = brans;
    }

}
