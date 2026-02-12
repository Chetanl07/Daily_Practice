
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorDemo5 {
    public static void main(String[] args) {
        Vector<String> listOfCity = new Vector<>();
        listOfCity.add("Surat");
        listOfCity.add("Pune");
        listOfCity.add("Mumbai");
        listOfCity.add("Delhi");

        Collections.sort(listOfCity);
        listOfCity.forEach(System.out::println);

// Sorting in vector class 
        System.out.println("----------------------");

        Vector<Integer> listOfNumbers = new Vector<>();
        listOfNumbers.add(500);
        listOfNumbers.add(900);
        listOfNumbers.add(400);

        listOfNumbers.add(300);
        listOfNumbers.add(800);
        listOfNumbers.add(200);

        System.out.println("Original data");
        System.out.println(listOfNumbers);

        System.out.println("\nAscending Order :");
        Collections.sort(listOfNumbers);
        System.out.println(listOfNumbers);

        System.out.println("\nDescending Order...");
        Collections.sort(listOfNumbers,(i1,i2) -> Integer.compare(i2, i2));
        System.out.println(listOfNumbers);

        // Converting our Vector (Collection Object) into Array

        Vector<String> listOfFruits = new Vector<>();
        listOfFruits.add("Orange");
        listOfFruits.add("Apple");
        listOfFruits.add("Mango");

        Object[] fruits = listOfFruits.toArray();
        System.out.println(Arrays.toString(fruits));
    }
}
