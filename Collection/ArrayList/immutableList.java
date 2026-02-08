import java.util.List;
public class immutableList {
    

    public static void main(String[] args) {
        List<Integer> listOfNumber = List.of(1,2,3,4,5);
        //listOfNumber.add(6);  // exception 
       // listOfNumber.remove(0);
        //listOfNumber.set(0, 100);
        System.out.println(listOfNumber);
    }
    
}


