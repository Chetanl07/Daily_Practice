public class JoinDemo1 {
    public static void main(String [] args) throws InterruptedException
    {
        System.out.println("Main thread Started !!!");

        Join j1= new Join();
        Join j2=new Join();
        Join j3= new Join();

        j1.setName("J1");  j2.setName("J2"); j3.setName("j3");
        j1.start();

        j1.join();  //main thread will wait for j1 thread to complete
        System.out.println("Main Thread wake up");

        j2.start();
        j3.start();

        System.out.println("Main thread Ended!!!");
    }
    
}

class Join extends Thread
{
    @Override
    public void run()
    {
        String name= Thread.currentThread().getName();
        System.out.println(name+" Thread started");

        for(int i=1;i<=5;i++)
        {
            System.out.println(i+" by "+name+" Thread");

            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(name+" thread completed!!");
    }
}