package review;

import java.util.*;
import java.util.function.*;

public class Practice {

    public static void main(String[] args) {

        //one parameter, return boolean value
        Predicate<Integer> greterThan10 = num -> num>10;
        System.out.println(greterThan10.test(5));

        //two inputs, return boolean
        BiPredicate<Integer, Integer> graterThan = (num1, num2) -> num1>num2;
        System.out.println(graterThan.test(20,123));

        //one parameter , no return
        Consumer<String> printStar = str -> System.out.println("*** " + str + " ***");
        printStar.accept("Harold");

        //two parameter , no return
        BiConsumer<String, String> combine = (str1, str2) -> System.out.println(str1 + " " + str2);
        combine.accept("Harold", "Fitch");

        //create a method that takes string and integer, print the string given number of times
        BiConsumer<String, Integer> printMultipleTimes = (str, num) ->{
            for (int i = 0; i < num; i++) {
                System.out.println(str);
            }
        };

        printMultipleTimes.accept("Albus", 10);

        //another task
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Steven",6000);
        map.put("Mike",7000);
        map.put("Joe",3000);
        map.put("Harold",4500);
        map.put("Albus",5500);

        //print the name of the employees whose salary is grater than 5000 (forEach)

        map.forEach((key, value) ->{
            if(value>5000) System.out.println(key);
        });


        //one parameter and return one
        Function<Integer, Integer> squared = x -> x*x;
        System.out.println(squared.apply(12));


        //no param and one return
        Supplier<String> value = () -> "some return";
        System.out.println(value.get());

        //create a lambda expression that takes 2 int array and combine to list of integer
        BiFunction<int[], int[], List<Integer>> combineArrays = (arr1, arr2) ->{
            List<Integer> result = new ArrayList<>();

            for (int each : arr1) {
                result.add(each);
            }

            for (int each : arr2) {
                result.add(each);
            }

            return result;
        };

        int[] array1 = {1,4,7,45};
        int[] array2 = {8,98,56};

        List<Integer> integerList = combineArrays.apply(array1,array2);
        System.out.println(integerList);
    }


}
