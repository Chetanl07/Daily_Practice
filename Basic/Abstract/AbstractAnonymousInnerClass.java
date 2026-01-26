public class AbstractAnonymousInnerClass {
    public static void main(String[] args) {
        // Anonymous inner class
        Vehicle car =new Vehicle()
        {
            public void run()
            {
                System.out.println("Car is Running");
            }
        };
        car.run();

        Vehicle Bike=new Vehicle()
        {
            public void run()
            {
                System.out.println("Bike is Running");

            }
        };
        Bike.run();

        
// Anonymous inner class without reference
        new Vehicle() {
        public void run()
        {
            System.out.println("Bus is running");
        }
        }.run();
        
    }
    
}
abstract class Vehicle
{
    public abstract void run();
}

