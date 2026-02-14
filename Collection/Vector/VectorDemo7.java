
import java.util.Scanner;
import java.util.Vector;

public class VectorDemo7 {
    public static void main(String[] args) {
        
        Vector<String> toDoList = new Vector<>();
        Scanner sc=new Scanner(System.in);

        int choice;
        do{
            System.out.println("To DO List Menu");
            System.out.println("1. Add task");
            System.out.println("2. View Tasks");
            System.out.println("3. mark task as Complete");
            System.out.println("4. Exit");

            System.out.println("Enter your Choice:");
            choice= Integer.parseInt(sc.next());

           switch(choice)
           {
            case 1 ->
            {
                // Add task
                System.out.println("Enter task Description: ");
                String task= sc.nextLine();
                toDoList.add(task);

                System.out.println("Task Added Successfully! \n");
            }

            case 2->
            {
                // View Tasks
                System.out.println("To do List: ");
                for(int i=0; i<toDoList.size();i++)
                {
                    System.out.println((i+1)+". "+ toDoList.get(i));
                }

                System.out.println();
            }

            case 3->
            {
                // mark task as completed
                System.out.println("Enter a task number to mark as Completed");
                int tasknumber = Integer.parseInt(sc.nextLine());

                if (tasknumber>= 1 && tasknumber<=toDoList.size() )
                 {
                    String completeTask = toDoList.remove(tasknumber-1);
                    System.out.println("Task marked as Completed :"+completeTask+"\n");
                }
                else{
                    System.out.println("Invalid task number \n");
                }

            }

            case 4->
            {
                System.out.println("Exiting ToDoList Application. GoodBye! ");
            }

            default -> System.out.println("Invalid Choice. please enter a valid option. \n");


           }
            
        }while(choice!=4);

        sc.close();
    }
}
