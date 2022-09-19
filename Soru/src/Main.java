public class Main
{
    public static void main(String[] args)
    {
        Person person1 = new Person();
        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getAge());
        System.out.println(person1.toString());

        person1.setFirstName("Mary");
        person1.setLastName("deneme");
        person1.setAge(20);
        System.out.println(person1.toString());

        Person person2 = new Person("Sahibinden","Deneme",20);
        System.out.println(person2.getFirstName());
        System.out.println(person2.getLastName());
        System.out.println(person2.getAge());
        System.out.println(person2.toString());
    }
}
