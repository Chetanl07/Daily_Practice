
import java.util.Arrays;
import java.util.List;

public class FixedLengthArray {
    public static void main(String[] args) {
        List<Integer> listOfNumber = Arrays.asList(1,2,3,4,5);
        //listOfNumber.add(6);  // exception 
       // listOfNumber.remove(0);
        listOfNumber.set(0, 100);
        System.out.println(listOfNumber);

    }
    
}
