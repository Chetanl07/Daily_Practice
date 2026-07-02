public class JoinDemo3 {
    public static void main(String[] args) {
        System.out.println("Main thread started");

        Thread t= Thread.currentThread();
        for(int i=1;i<=10;i++)
        {
            System.out.println("I value is : "+i+" by "+t.getName());

            try
            {
                t.join();  //main thread will wait for main thread to complete [Deadlock]
            }
            catch(InterruptedException e){}
        }
        System.out.println("Main Thread Ended");
    }
    
}
