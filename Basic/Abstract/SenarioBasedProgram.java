
public class SenarioBasedProgram {
    public static void main(String[] args) {

        Lion lions[]={new Lion(),new  Lion(),new Lion()};

        Bird birds[]=new Bird[2];
        birds[0]=new Bird();
        birds[1]=new Bird();

        Dog []dogs=new Dog[]{new Dog(),new Dog(),new Dog()};

        Monkey monkey =new Monkey();
        Tiger tiger=new Tiger();

        AnimalCkecupHospital(monkey,tiger);
        AnimalCkecupHospital(lions);
        AnimalCkecupHospital(dogs);
        AnimalCkecupHospital(birds);
             
    }    

    public static void AnimalCkecupHospital(Animal ...animals)
    {
        for(Animal animal : animals)
        {
            animal.checkup();
        }
    }
}

abstract class Animal
{
    public abstract  void checkup();
}
class Lion extends  Animal{
    @Override
    public void checkup()
    {
        System.out.println("Lion is going for checkup");
    }
}
class Bird extends  Animal
{
    @Override 
    public void checkup()
    {
        System.out.println("Bird is going for checkup");
    }
}

class Dog extends Animal{
@Override
public void checkup()
{
    System.out.println("Dog is going for checkup");

}
}
class Monkey extends Animal
{
    @Override
    public void checkup()
    {
        System.out.println("Mokey is going for checkup");
    }
}

class Tiger extends  Animal{
    @Override
    public void checkup()
    {
        System.out.println("Tiger is going for checkup");
    }
}

