
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo8 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Alpha"); // 0
        list.add("Beta"); // 1 
        list.add("Gamma"); //2
        
        ListIterator<String> listItr= list.listIterator();
        System.out.println("Previous Index : " +listItr.previousIndex());//-1
        System.out.println("Next Index : "+listItr.next()); //0

        while(listItr.hasNext())
        {
            String data =listItr.next();
            int index = listItr.nextIndex();
            System.out.println("Object at : "+(index-1)+" Index : "+data);

        }

    }
    
}
