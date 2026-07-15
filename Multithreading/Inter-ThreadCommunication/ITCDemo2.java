public class ITCDemo2 {
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Main Thread Started....");

        Test t1= new Test();
        t1.start();

        try
        {
            Thread.sleep(100);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(t1.getData());
        
    }    
}

class Test extends  Thread
{
    private int data =0;

    @Override
    public void run() 
    {
        for(int i=1; i<=10;i++)
        {
            this.data= this.data+i;

            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }    
    }

    public int getData()
    {
        return this.data;
    }
    
}
