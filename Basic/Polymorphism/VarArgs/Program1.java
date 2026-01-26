public class Program1 {
   
        public static void main(String []args)
        {
            Test t1=new Test();
            t1.input();
            t1.input(5);
            t1.input(5,10);
            t1.input(5,10,15);

        }
}
class Test
{
    public void input(int ...x)
    {
        System.out.println("Executed!!!");
    }
}
