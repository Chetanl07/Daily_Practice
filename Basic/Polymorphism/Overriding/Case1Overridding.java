public class Case1Overridding {
    public static void main(String[] args) {
        Animal a1;
        a1=new Dog();
        executedAnimal(a1);

        System.out.println("----------------");

        a1=new Lion();
        executedAnimal(a1);
       
        
    }

    public static void executedAnimal(Animal animal)
    {
        animal.sleep();
    }
}
class Animal
{
    public void sleep()
    {
        System.out.println("Generic Animal ia sleeping");
    }
}
class Dog extends Animal{
    public void sleep()
    {
        System.out.println("Dog is Sleeping");
    }
}

class Lion extends  Animal{
    public void sleep()
    {
        System.out.println("Lion is Sleeping");
    }
}
