import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,2,4,1,3,6,2,3,2,3,1,9);
       // filter.forEach(x -> System.out.println(x));
        myList.forEach(System.out::println);


        //FILTER
        System.out.println("FILTER");
        myList.stream()
                .filter(x -> x%2==0)
                .distinct()
                .forEach(System.out::println);

        //LIMIT
        System.out.println("LIMIT");
        myList.stream()
                .filter(i -> i%3==0)
                .limit(1)
                .forEach(System.out::println);

        //SKIP
        System.out.println("SKIP");
        myList.stream()
                .filter(i -> i%3==0)
                .skip(2)
                .forEach(System.out::println);

        //MAP
        System.out.println("MAP");
        myList.stream()
                .map(x-> x*3)
                .filter(x -> x%2==0)
                .forEach(System.out::println);



    }
}
