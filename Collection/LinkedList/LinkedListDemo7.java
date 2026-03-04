
import java.util.LinkedList;

public class LinkedListDemo7 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");
        list.add("Item 6");
        list.add("Item 7");
        list.add("Item 9");
        list.add(0,"Item 0");
        list.add(1,"Item 1");
        list.add("Item 8");
        list.add("Item 10");

        System.out.println(list);

        list.remove("Item 5");
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.set(0,"Ajay");
         list.set(1,"chetan");
          list.set(2,"Ashu");
           list.set(3,"datta");
            list.set(4,"vinod");
             list.set(5,"sumit");

             list.forEach(System.out::println);
    }
    
}
