import java.util.StringTokenizer;
public class StringTokenizerMethod {
    public static void main(String []args)
    {
        String str="Hydrabad is a lovely place";
        
        StringTokenizer st=new StringTokenizer(str," ");
        System.out.println("Number of tokens :"+st.countTokens());


    }
    
}
