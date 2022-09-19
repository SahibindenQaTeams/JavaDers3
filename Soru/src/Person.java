public class Person
{
        /*
        Person:
    3 değişken içeren Person sınıfı yazın : firstName,lastName,age
    •	Bu değişkenler için getter ve setter methodlarını oluşturun.
    •	toString() adında bir method oluşturup orijinal toString() metodunu override edelim. Parametresi olmasın ve şu
    formatta string tipinde bir değer döndürsün "firstName | lastName | age".

    Not: method sadece string tipinde bir değişken döndürecek, konsol ekranına bir değer basılmayacak.
    •	3-parametreli constructor (Kurucu metod) tanımlayınız.
    Bu metod aldığı parametreler ile firstname, lastname ve age değişkenlerine parametreler ile gönderilen değerlerin
    atamasını gerçekleştirecek.
    •	Parametresiz bir constructor (Kurucu metod) tanımlayınız.
    Person nesnesi içerisinde bulunan değişkenlere varsayılan değerlerini tanımlayınız.
    firstName ve lastName için boş yani ""
    age için -1 değeri atanacak.

         */

    //değişken
    private String firstName;
    private String lastName;
    private int age;

    //getter-setter
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString(){
        return firstName + "|" + lastName + "|" + age;
    }

    //constructor
    public Person(String firstName, String lastName,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age= age;
    }

    // bos constructor
    public Person(){
        firstName = " ";
        lastName = " ";
        age = -1;
    }
}
