public class ExtraProgram {
    public static void main(String[] args) {
        Vehicle vehicle=new Car();
        vehicle.printTankCapacity();
    }
    
}
class Vehicle
{
    public int tankCapacity()
    {
        return 80;
    }

    public void printTankCapacity()
    {
        System.out.println(this.tankCapacity());
    }

}
class Car extends Vehicle
{
    @Override
    public int tankCapacity()
    {
        return 40;
    }
    public void printTankCapacity()   // if we comment this method [Output 40]
    { 
        System.out.println(super.tankCapacity());
    }

}

// output : 80