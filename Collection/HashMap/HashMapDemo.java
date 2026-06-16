
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> Map = new HashMap<>();

        Map.put(1, " Vanilla");
        Map.put(2, " butterScotch");
        Map.put(3, " Chocalate");
        Map.put(4, " Cotton Candy");

        System.out.println("HashMap entries are:");
        System.out.println(Map);

        System.out.println("By using forEach method : ");
        Map.forEach((key,value)-> System.out.println("Key is : "+ key+" Value is : "+value));

        String iceCream = Map.get(4);
         System.out.println(iceCream);

         iceCream= Map.getOrDefault(1,"This is not existing");
         System.out.println(iceCream);

         boolean hasKey= Map.containsKey(3);
         System.out.println("Has map contains key 3: "+hasKey);

         boolean hasValue = Map.containsValue(" Vanilla");
         System.out.println("Hash map contains value Vanilla "+hasValue);

         Map.remove(3);
         System.out.println("After removing key 3 map is : "+Map);

         System.out.println("Iterating through Iterator : ");
         
         Iterator <Map.Entry <Integer,String>> itr = Map.entrySet().iterator();
         itr.forEachRemaining(System.out::println);

         System.out.println("Iterating through HashMap");
         for(HashMap.Entry<Integer,String> entry: Map.entrySet())
         {
            System.out.println("Key is : "+ entry.getKey()+" value is : "+ entry.getValue());
         }

         int size = Map.size();
         System.out.println("Hashmap after clearing "+Map);
         System.out.println("Is map empty :"+Map.isEmpty());

  }
}
