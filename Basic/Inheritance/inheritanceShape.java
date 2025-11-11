
import java.util.Scanner;

public class inheritanceShape
 {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius :");
        double r=sc.nextDouble();

        circle c=new circle(r);
        c.getAreaOfCircle();

        System.out.println("------------------------------");

        rectangle rr=new rectangle(10, 5);

        rr.getAreaOfRectangle();

    
        
    }
    
}
class Shape{
    protected double x;
    public Shape(double x)
    {
        this.x=x;
        System.err.println("x value is :"+x);
    } 
}



class circle extends Shape{
   final double PI=3.14;
   public circle(double radius)
   {
    super(radius);
   }

   public void getAreaOfCircle()
   {
    double area= PI*x*x;
    System.out.println("Area of Circle is :"+area);
   }
}

class rectangle extends Shape{
    private double y;
    public rectangle(double length,double breadth)
    {
        super(length);
        this.y=breadth;
    }

    public void getAreaOfRectangle()
    {
        double area=x*y;
        System.out.println("Area of Rectangle is :"+area);
    }
}