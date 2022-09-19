public class Bird extends Animal
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
    public Bird(String name,int age,String breed){
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
                "Age in human years: " + this.getAgeInHumanYears();
    }

    public boolean equals(Bird otherBird){
        return this.getName().equals(otherBird.getName()) &&
                this.getAge() == otherBird.getAge() &&
                this.getBreed().equals(otherBird.getBreed());
    }
}
