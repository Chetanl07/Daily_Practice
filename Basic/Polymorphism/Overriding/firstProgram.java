public class firstProgram {
    public static void main(String []args)
{
    Animal animal=new Dog();
    animal.eat();  // Dog is eating
}
}
class Animal 
{firs
    public void eat()
    {
        System.out.println("Generic Eating");
    }
}
class Dog extends Animal
{
    public void eat()
    {
        System.out.println("Dog is Eating");
    }
}
