public class SearchingFlow {
    public static void main(String[] args) {
        Bird bird=new Chick();
        bird.sleep();
    }
    
}

class Bird
{
    public void sleep()
    {
        System.out.println("Generic Bird is sleeping");
    }
}

class Hen extends Bird{
    public void sleep()
    {
        System.out.println("Hen Bird is Sleeping");
    }
}

class Chick extends Hen{
    public void sleep()
    {
        System.out.println("Chick Bird is Sleeping");

    }
}