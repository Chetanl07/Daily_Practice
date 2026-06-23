// IQ frequency count(Count the Frequency of each word)
import java.util.HashMap;

public class HashMapDemo5 {
    public static void main(String[] args) {
        String text= "Java is fun, java is powerful java is great";
        String words[] = text.split(" ");

        HashMap<String,Integer> wordCount= new HashMap<>();

        for(String word : words)
        {
            wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
        }

        System.out.println("Word Frequency: "+wordCount);
    }
    
}

