
import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo4 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> al=new ArrayList<>();

        for(int i=0;i<1000;i++)
        {
            al.add(i);
        }

        long endTime=System.currentTimeMillis();
        System.out.println("Total time taken by Array List class : "+(endTime-startTime)+"ms");

        startTime=System.currentTimeMillis();
        Vector<Integer> v1= new Vector<>();

        for(int i=0;i<1000;i++)
        {
            v1.add(i);
        }

        endTime=System.currentTimeMillis();

         System.out.println("Total time taken by Vector class : "+(endTime-startTime)+"ms");


    }
    
}
