// Program on Arraylist that contains null values as well as we can pass
// the element based on the index position

import java.util.ArrayList;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        ArrayList<Object> a1= new ArrayList<>();
        a1.add(12);
        a1.add("Ravi");
        a1.add(12);
        a1.add(3,"hyderabad");
        a1.add(1,"Naresh");
        a1.add(null);
        a1.add(11);
        System.out.println(a1);
        // 12 naresh Ravi 12 Hyderabad null 11
    }
    
}
