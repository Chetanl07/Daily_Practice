// by using lambda calculate sum 
public class Lambda_expression1 {
    public static void main(String[] args) {
        calculate c1=(a,b) -> System.out.println("Sum is : "+(a+b));
        c1.doSum(100, 50);
    }
    
}
interface  calculate
{
    void doSum(int x,int y);
}
