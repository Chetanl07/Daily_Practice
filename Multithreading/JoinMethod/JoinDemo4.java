public class JoinDemo4 {
    public static void main(String[] args) throws InterruptedException
     {

        OTPVerification otp = new OTPVerification();
        BalanceCheck bc= new BalanceCheck();

        bc.start();;
        otp.start();

        bc.join();
        otp.join();

        // if both threads completed successfully then only main thread will proceed.

        System.out.println("Initialization money transfer...");
        System.out.println("Transfer Successful...");


        
    }
}

class OTPVerification extends Thread
{
    public void run()
    {
        System.out.println("Verifying OTP....");

        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread is Interrupted");
        }

        System.out.println("OTP verified");
    }
}

class BalanceCheck extends Thread
{
    public void run()
    {
        System.out.println("Checking account balance...");
        try
        {
            Thread.sleep(1500);
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread is Interrupted ");
        }

        System.out.println("Sufficient Balance Available...");
    }

}