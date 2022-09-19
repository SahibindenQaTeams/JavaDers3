public class Main
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Bold",2,"pitbul");
        Dog dog1 = new Dog("Bold",2,"pitbul");

        System.out.println(dog.equals(dog1));

        dog.setBreed("hgajshd");
        dog.setName("abcn");
        dog1.setAge(4);
        dog1.setName("dnemeee");
        System.out.println(dog.toString());
        System.out.println(dog1.toString());

        System.out.println("----------------");

        Bird bird = new Bird("sgahd",3,"agdhvs");
        Bird bird1 = new Bird("fsagd",5,"tsafdg");

        bird.setBreed("ta");
        System.out.println(bird.toString());

        System.out.println("----------------");

    }
}
