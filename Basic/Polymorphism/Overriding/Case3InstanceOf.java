public class Case3InstanceOf {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        executedAnimal(a1);

        System.out.println("--------------------");

        a1=new Lion();
        executedAnimal(a1);
    }

    public static void executedAnimal(Animal animal)
    {
        if(animal instanceof  Dog)  // OLD TECHNIWUE
        {
            Dog dog =(Dog)animal;  
            dog.sleep();
            dog.Bark();
        }
        else if(animal instanceof  Lion lion)   //NEW TECHNIQUE [Java 16v]
        {
            lion.sleep();
            lion.roar();
        }
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
    public void Bark()
    {
        System.out.println("Dog is Barking ");
    
    }
}

class Lion extends  Animal{
    public void sleep()
    {
        System.out.println("Lion is Sleeping");
    }

    public void roar()
    {
        System.out.println("Lion is roaring ");

    }
}

