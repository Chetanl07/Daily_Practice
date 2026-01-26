/*Note : if a class contains more than 1 static block, then it will be executed
 from top to bottom  */



public class StaticBlockDemo1 {
    public static void main(String[] args) {
        System.out.println("Main method Executed");

        System.out.println(test.x);
    
    }
    
}
class test
{
    static int x;
    static {
        x=100;
        System.out.println("x value is :"+x);
    }

    static
    {
        x=200;
        System.out.println("x value is :"+x);
    }
    static {
        x=300;
        System.out.println("x value is :"+x);
    }
}

/*
output : main method Executed
x value is :100
x value is :200
x value is :300
300
*/