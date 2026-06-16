
import java.util.stream.Stream;

public class CloseStream {
    public static void main(String[] args) {
        Stream<Integer> streamOfNum = Stream.of(1,2,3,4,5,6,7);
        streamOfNum.forEach(System.out::println);

        System.out.println("-------------------------");

     //streamOfNum.forEach(System.out::println); // java.lang.IllegalStateException:
    }
    
}
