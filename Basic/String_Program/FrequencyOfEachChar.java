public class FrequencyOfEachChar {
   public static  void main(String []args)
{
    String str = "Hello world";
    char ch[] = str.toCharArray();

    for(int j = 0; j < ch.length; j++)
    {
        // Skip characters already counted
        boolean processed = false;
        for(int k = 0; k < j; k++)
        {
            if(ch[k] == ch[j])
            {
                processed = true;
                break;
            }
        }

        if(processed) continue;

        int count = 0;

        // Count occurrences
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[j] == ch[i])
            {
                count++;
            }
        }

        System.out.println(ch[j] + " : " + count);
    }
}
    
}
