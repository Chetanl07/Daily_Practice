import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorDemo2 {
    public static void main(String[] args) {
        Vector<Integer> v= new Vector<>();
        int x[]= {22,20,10,40,15,58};

    // Adding array element into vector
        for (int i = 0; i <x.length; i++) {
            v.add(i);
        }

    // Collection.sort(v);      [old technique]
        v.sort((i,i1)-> i1-i);  // new technique
        v.forEach(y-> System.out.println(y));

        System.out.println("Maximum element is :"+Collections.max(v));
        System.out.println("Minimum element is : "+Collections.min(v));
        System.out.println("vector elements");

        v.forEach(y -> System.out.println(y));

        System.out.println("-----------------");
        Collections.reverse(v);

        System.out.println("After reverse");
        v.forEach(y -> System.out.println(y));

    // How to convert collection to Array
        Object[] array = v.toArray();
        System.out.println(Arrays.toString(array));
    }
    
}
