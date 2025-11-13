/*Here foo .class file is not loaded into JVM memory so static block of 
foo class will not be executed.*/

class foo{
    foo()
    {
    System.out.println("No argument constructor");
    }
    {
        System.out.println("Non static block");
    }
    static
    {
        System.out.println("Static Block");
    }
}

public class StaticBlockDemo {
    public static void main(String[] args) {
        System.out.println("Main method Executed");
    }
}

// Output : Main method Executed 