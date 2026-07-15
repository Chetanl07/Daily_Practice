public class ITCDemo3 {
    public static void main(String[] args) throws InterruptedException
    {
        Demo d1= new Demo();
        Thread t1= new Thread(d1);
        t1.start();

        synchronized (d1)
        {
            System.out.println("Main thread is going to wait, after releasing the lock ");
            d1.wait();
            System.out.println("Main thread got notification");
            System.out.println(d1.data);
        }
        
    }
    
}

class Demo implements Runnable
{
    int data =0;

    @Override
    public void run()
    {
        synchronized (this)
        {
            System.out.println("Child thread got the Lock ");
            for(int i=1;i<=1000;i++)
            {
                data = data+i;
            }
            System.out.println("Sending notification to main thread ");
            notify();
            
        }
        
    }
    
}