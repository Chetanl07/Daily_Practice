
import java.util.Arrays;
// sorting in descending order 
public class descendingOrderInArray {
    public static void main(String[] args) {
        Integer[] arr = {30,50,10,20};
        Arrays.sort(arr, (i1, i2) -> i2.compareTo(i1));
        System.out.println(Arrays.toString(arr));
    }
}
