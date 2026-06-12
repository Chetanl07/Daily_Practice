public class JoinDemo2 {
    public static void main(String[] args) {
        Alpha a1= new Alpha();
        a1.setName("Alpha_thread");
        a1.start();
        
    }
    
}
class Alpha extends Thread
{
    @Override
    public void run()
    {
        Thread t= Thread.currentThread();
        String name = t.getName();      // Alpha_Thread is current thread

        Beta b1= new Beta();
        b1.setName("Beta_Thread");
        b1.start();

        try
        {
            b1.join();          //alpha thread is waiting for Beta Thread to Complete
            System.out.println("Alpha thread re-started");
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++)
        {
         System.out.println(i+" By "+name);   
        }
    }
}

class Beta extends Thread
{
    @Override
    public void run()
    {
        Thread t= Thread.currentThread();
        String name = t.getName();  // Beta_Thread

        for (int i = 0; i < 20; i++) 
        {
            System.out.println(i+" by "+name);

            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e){}
            
        }
        System.out.println("Beta Thread Ended ");
    }


}