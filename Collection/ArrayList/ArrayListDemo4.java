
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) throws IOException
     {
        ArrayList<String> listOfIceCream = new ArrayList<>();
        listOfIceCream.add("Vanila");
        listOfIceCream.add("Strwaberry");
        listOfIceCream.add("Butter scotch");
// serialization
        String filepath= "C:\\Users\\cnlav\\OneDrive\\Desktop\\Naresh it\\Java lab\\hello.txt";
        var fos= new FileOutputStream(filepath);
        var oos= new ObjectOutputStream(fos);

        try(fos;oos)
     {
        oos.writeObject(listOfIceCream);
        System.out.println("Data stored Successfully ");
        } 
        catch (Exception e)
         {
            e.printStackTrace();
        }

// De- Serialization

        var fin= new FileInputStream(filepath);
        var ois= new ObjectInputStream(fin);

        try(fin;ois)
        {
            @SuppressWarnings("unchecked")
            ArrayList<String> icecream = (ArrayList<String>) ois.readObject();
            System.out.println(icecream);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
    
}
