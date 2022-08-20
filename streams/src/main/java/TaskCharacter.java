import java.util.Arrays;
import java.util.List;

public class TaskCharacter {

    public static void main(String[] args) {

        //TASK
        //Given a list of words, print the number characters for each word
        System.out.println("TASK 1");
        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");
        words.stream()
                .map(x -> x.length())
                .forEach(System.out::println);
    }


}
