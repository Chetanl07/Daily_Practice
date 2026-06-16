
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Integer,String> studentRecords = new HashMap<>();

        studentRecords.put(101, "Scott");
        studentRecords.put(102, "Smith");
        studentRecords.put(103, "Martin");
        studentRecords.put(104, "Aryan");

        System.out.println("Student records : "+studentRecords);

        int searchId = 105;
        String studentName= studentRecords.get(searchId);
        if(studentName != null)
        System.out.println(studentName);
        else
        System.out.println("id "+searchId+" is not existing");

        // we can use Optional here 

        Optional<String> ofNullAble = Optional.ofNullable(studentName);
        System.out.println(ofNullAble.orElse("this is not existing"));

        System.out.println(studentRecords.put(103,"Rahul"));
        System.out.println("Updated records :"+studentRecords);

        studentRecords.remove(104);
        System.out.println("Records after removal :"+studentRecords);

        int idToCheck= 101;
        System.out.println("Does ID "+idToCheck+" Exist? "+studentRecords.containsKey(idToCheck));

        String nameToCheck = "Aryan";
        System.out.println("Does name "+ nameToCheck+" Exist ? "+ studentRecords.containsValue(nameToCheck));

        System.out.println("Iterating through records:");
        for(Map.Entry<Integer,String > entry: studentRecords.entrySet())
        {
            System.out.println("ID: "+entry.getKey()+", Name "+ entry.getValue());
        }

        studentRecords.clear();
        System.out.println("All record cleared :"+studentRecords);
    }
    
}
