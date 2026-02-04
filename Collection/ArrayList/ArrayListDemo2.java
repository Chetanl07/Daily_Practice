// Arraylist 
import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        
        ArrayList<String> a1= new ArrayList<>();
        a1.add("Ravi");
        a1.add("rahul");
        a1.add("Rohit");

        ArrayList<String> a2=new ArrayList<>();
        a2.add("Pallavi");
        a2.add("sweta");
        a2.add("Puja");

        a1.addAll(a2);
        System.out.println("Size of a1 : "+a1.size());
        a1.forEach(str -> System.out.println(str.toUpperCase()));
        System.out.println("---------------------------");

         ArrayList<String> a3= new ArrayList<>();
        a3.add("Ravi");
        a3.add("Rahul");
        a3.add("Rohit");

         ArrayList<String> a4= new ArrayList<>();
        a4.add("Pallavi");
        a4.add("Rahul");
        a4.add("raj");


        a3.retainAll(a4);
        a3.forEach(x -> System.out.println(x));
        System.out.println(a3.size());
    }
    
}
