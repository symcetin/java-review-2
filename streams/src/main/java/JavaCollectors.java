import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,4,5,5,6,6,7,34);

        System.out.println("****TOCOLLECTION()****");//customise way, more way you can use set, map,list
        //toCollection(Supplier) : is used to create a collection using collector
        //after filter, with toCollector, put everything to ArrayList
       List<Integer> numberList = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);

        //toList() : returns a Collector interface that gathers the input data into a new List
        System.out.println("****TOLIST()****");  //toList only converts to list
        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        //toSet() : returns a Collector interface that gathers the input data into a new set
        System.out.println("****TOSET()****");  //toList only converts to list
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        //toMap(Function,Function) : returns a Collector interface that gathers the input data into a new map
        System.out.println("****TOMAP()****");  //toList only converts to list
        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));

        System.out.println(dishMap);

        //counting() : returns a Collector that counts the number of the elements
        System.out.println("****COUNTING()****");
        Long evenCount = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.counting());

        System.out.println(evenCount);

        //summingInt(toIntFunction) :returns a Collector that produces the sum of a integer-valued func
        System.out.println("****SUMMING()****");
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        //averagingInt(ToIntFunction) : returns the average of the integers passed values
        System.out.println("****AVERAGING()****");
        double calAvg = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calAvg);

        //joining() : is used to join various elements osf a character or string array into a single string obj
        System.out.println("****JOINING()****");
        List<String> courses = Arrays.asList("Java", "JS", "TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

        //partitioningBy() : is used to partition a stream of objects(or set of elements) based on a given predicate
        System.out.println("********PARTITIONINGBY()***********");
        Map<Boolean,List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(veggieDish);

        //groupingBy() : is used for groping objects by some property and storing results in a map instance
        System.out.println("********GROUPINGBY()***********");
        Map<Type,List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(dishType);
    }
}
