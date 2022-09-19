public class Dog extends Animal
{
    //değişken
    private String breed;
    int humanYears;

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    //constructor
    public Dog(String name,int age,String breed){
        super(name,age); //Alt sınıf constructor içerisinde üst sınıf constructorı  çağırmak için super() kullanın.
        this.breed = breed;
    }


    @Override
    public int getAgeInHumanYears()
    {
        if (getAge()<=2){
            return getAge() + 11;
        }else{
            return 22+((getAge()-2)*5);
        }
    }

    @Override
    public String toString(){
        return "Name: " + this.getName() +"\n" +
                "Breed: " + this.getBreed() + "\n" +
                "Age in calendar years:" + this.getAge() + "\n" +
                "Age in human years: " +this.getAgeInHumanYears();
    }

    public boolean equals(Dog otherDog){
        return this.getName().equals(otherDog.getName()) &&
                this.getAge() == otherDog.getAge() &&
                this.getBreed().equals(otherDog.getBreed());
    }
}
