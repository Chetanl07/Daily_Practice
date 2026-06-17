
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<Integer,String> newMap1= new HashMap<>();
        HashMap<Integer,String> newMap2 = new HashMap<>();

        newMap1.put(1,"OCPJP");
        newMap1.put(2, "is");
        newMap1.put(3, "Best");

        System.out.println("Values in newmap 1 :"+newMap1);
        newMap2.put(4, "Exam");

        System.out.println("After using putAll");

        newMap1.putAll(newMap2);

        newMap1.forEach((k,v)-> System.out.println(k+" : "+v));

        System.out.println("All the keys are : ");
        Set<Integer> keySet = newMap1.keySet();
        System.out.println(keySet);

        System.out.println("All the Values are :");
        Collection <String> value = newMap1.values();
        System.out.println(value);

        // Loose Coupling
        HashMap<String, String> map1=new HashMap<>();
        map1.put("chentan@gmail.com", "chetan123");
        map1.put("Datta@gmail.com", "datta123");
        map1.put("Vinod@gmail.com", "vinod123");

        System.out.println("from map 1 :" + map1);

        HashMap<String,String> map2 = new HashMap<>();
        System.out.println("From map 2"+map2);
    }    
}
