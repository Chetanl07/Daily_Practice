
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListDemo4 {
    public static void main(String[] args) {
        List<Integer> linkedlist= new LinkedList<>();
        Scanner sc= new Scanner(System.in);

        while(true)
        {
            System.out.println("Linked list: "+linkedlist);
            System.out.println("1. Insert elements");
            System.out.println("2. Delete element ");
            System.out.println("3. Display Element");
            System.out.println("4. Exit");

            System.out.println("Enter your Choice: ");
            int Choice= Integer.parseInt(sc.nextLine());

            switch(Choice)
            {
                case 1 ->
                {
                    System.out.println("Enter the Element to insert : ");
                    int elementToAdd=Integer.parseInt(sc.nextLine());
                   linkedlist.add(elementToAdd);
                }
                case 2 ->
                {
                    if(linkedlist.isEmpty())
                    {
                        System.out.println("Linked list is empty . Nothing to delete");
                    }
                    else
                    {
                        System.out.println("Enter the element to delete: ");
                        int elementToDelete= Integer.parseInt(sc.nextLine());
                        boolean isRemove = linkedlist.remove(Integer.valueOf(elementToDelete));
                        
                        if(isRemove)
                        {
                            System.out.println(elementToDelete+"element deleted");
                        }
                        else{
                            System.out.println(elementToDelete+"not deleted");
                        }
                    }

                }
                case 3 ->
                {
                    System.out.println("Element in the linked list.");
                    linkedlist.forEach(System.out::println);

                }

                case 4 ->
                {
                    System.out.println("Exiting the program ");
                    sc.close();
                    System.exit(0);

                }

                default -> System.out.println("Invalid chioic");
            }




        }
    }
    
}
