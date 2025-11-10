public class SingleLevelInheritance {
    public static void main(String []args)
    {
        car c=new car();
        c.startVehicle();
        c.carInfo();

    }
}

class car extends vehicle
{
    protected String engineType="battery";

    public void carInfo()
    {
        System.out.println("Car Engine Type: "+engineType);
        System.out.println("Number of Engines: "+numberOfEngine);   
    }

}
class vehicle{
    protected int numberOfEngine=1;
    public void startVehicle()
    {
        System.err.println("Vehicle Started");
    }
}
