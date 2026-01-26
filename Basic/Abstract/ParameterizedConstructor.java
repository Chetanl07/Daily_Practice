public class ParameterizedConstructor {
    public static void main(String[] args) {
        Vehicle vehicle =new Bike("KTM");
        Bike bike=(Bike) vehicle;

        System.out.println(bike.getBikeName());
        vehicle.run();
        
    }
    
}
abstract  class Vehicle
{
    protected  String name;
    public Vehicle(String name)
    {
        super();
        this.name=name;
    }
    public abstract  void run();
}
class Bike extends Vehicle
{
    public Bike(String name)
    {
        super(name);
    }
    @Override
    public void run()
    {
        System.out.println("Bike is running");
    }
    public String getBikeName()
    {
        return  this.name;
    }
}