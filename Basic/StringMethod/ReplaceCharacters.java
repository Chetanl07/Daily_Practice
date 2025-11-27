public class ReplaceCharacters {
    public static void main(String []args)
    {
        String s1="ababababa";

        System.out.println("Before Replacement :"+s1);

        s1=s1.replace('b', 'B');
        System.out.println("After Replacement :"+s1);

        String s2= "Manager";
        System.out.println(s2.replace("Man","Dam"));

    }
    
}
