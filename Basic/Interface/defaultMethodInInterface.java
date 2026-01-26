public class defaultMethodInInterface {
    public static void main(String[] args) {
        Vehicle v=null;

        v=new Car();
        v.run();
        v.horn();
        v.digitalMeter();

        v=new Bike();
        v.run();
        v.horn();
        v.digitalMeter();
        
    }
    
}
 interface Vehicle
{
    void run();
    void horn();
    default  void digitalMeter()  // Am is Public 
    {
        System.out.println("digital meter facility coming soon");
    }

}

class Car implements Vehicle
{
    public void run()
    {
        System.out.println("Car is running ");
    }
    public void horn()
    {
        System.out.println("Car is having horn facility");
    }
    public void digitalMeter()
    {
        System.out.println("Car is having Digital meter facility");
    } 
}
class Bike implements Vehicle
{
    public void run()
    {
        System.out.println("Bike is running ");
    }
    public void horn()
    {
        System.out.println("Bike is having horn facility");
    }
}


