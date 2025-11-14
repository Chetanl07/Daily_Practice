// static variable are also having default values

public class StaticBlockDemo2 {
    public static void main(String[] args) {
        new foo();
    
    }
    
}
class foo{
    static int x;

    static {
        System.out.println("x value is :"+x);
    }
}