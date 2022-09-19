public abstract class Animal
{
    //değişkenler
    private String name;
    private int age;

    //getter-setter
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public abstract int getAgeInHumanYears(); //abstract method

    //constructor

    public Animal(String name, int age){
        this.name=name;
        this.age = age;
    }
}
