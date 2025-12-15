public class ConstructorInAbstract {
    public static void main(String[] args) {
     TestDemo d =new Demo();
        d.message();
    }
   
}
class Demo extends TestDemo{
    Demo(){
        super();
        System.out.println("Hello from Abstract Constructor");
    }
    public void message(){
        System.out.println("Hello from Main class method");
    }
}
abstract class TestDemo{
 public TestDemo(){
        System.out.println("Hello from Abstract Constructor");
    }
    public abstract void message();
}