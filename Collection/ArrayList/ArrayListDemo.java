// sum  of all the elements present in the array list
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>(20);

    numbers.add(100);
    numbers.add(100);
    numbers.add(100);
    numbers.add(100);
    numbers.add(100);

    int sum=0;

    for(int number :numbers)
    {
        sum+=number;
    }

    System.out.println("Sum of Numbers : "+sum);
    }
}
