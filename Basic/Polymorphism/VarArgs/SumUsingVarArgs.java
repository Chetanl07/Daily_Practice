public class SumUsingVarArgs {
    public static void main(String[] args) {
     Addition a=new Addition();
     a.sumOfParameter(1,2,3,4,5);   
    }
    
}
class Addition
{
    public void sumOfParameter(int ...x)
    {
        int sum=0;
        for(int y:x)
        {
            sum+=y;
        }

        System.out.println("sum of parameter is : "+sum);
    }
}
