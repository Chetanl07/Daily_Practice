// sample lambda function
public class Lambda_expression {
    public static void main(String[] args) {
        Vehical car=()->System.out.println("Car is running");
        car.run();

        Vehical bike = () -> System.out.println("Bike is running");
        bike.run();
    }

    
}

interface Vehical
{
    void run();
}
