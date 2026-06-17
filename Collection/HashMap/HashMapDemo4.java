
import java.util.HashMap;

public class HashMapDemo4 {
    public static void main(String[] args) {
        //Creating a HashMap to store book titles and their availability (True = available, false = borrowed)
        HashMap<String,Boolean> library = new HashMap();
        library.put("Core Java", true);
        library.put("Advanced Java", true);
        library.put("HTML", false);
        library.put("JavaScript", true);

        // Display the initial library Status
        System.out.println("Initial Library Status");
        library.forEach((key,value) -> System.out.println(key+" : "+value));

        //Borrow a book
        String bookToBorrow = "Advanced Java";

       

        if(library.containsKey(bookToBorrow) && library.get(bookToBorrow))
        {
            library.put(bookToBorrow, false);
            System.out.println(bookToBorrow+" Has borrowed Successfully");
        }
        else System.out.println(bookToBorrow+" book is not available for borrow ");

        String bookToReturn = "HTML";
        if(library.containsKey(bookToReturn) &&! library.get(bookToReturn))
        {
            library.put(bookToReturn, true);
            System.out.println(bookToReturn+"Has returned by the user");
        }
        else System.out.println(bookToReturn+" is not in the library");

        library.forEach((k,v)-> System.out.println(k+" : "+v));

    }
    
}
