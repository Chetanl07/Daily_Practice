// Class loading for the Static Block execution

public class StaticBlockDemo4 {
    public static void main(String []args)
    {
        new B();  // class loading + object cration


    }
    
}

class A
{
   static 
   {
    System.out.println("A");
   }
   {
    System.out.println("B");
    }

    A()
    {
        System.out.println("C");
    }
}

class B extends A
{
    static 
    {
     System.out.println("D");
    }
    {
     System.out.println("E");
     }
 
     B()
     {
         System.out.println("F");
     }
}


/*
output :
A
D
B
C
E
F
 */
