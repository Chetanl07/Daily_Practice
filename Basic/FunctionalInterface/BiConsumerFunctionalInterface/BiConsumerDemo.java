
import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String [] args)
    {
        BiConsumer <Integer,String> UpdateVariable = (num,str) -> 
        {
            num=num*2;
            str=str.toUpperCase();

            System.out.println("updated values: "+ num +" ,"+str);

        };
    }
    
}
