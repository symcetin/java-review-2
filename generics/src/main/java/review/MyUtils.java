package review;

import java.util.List;

public class MyUtils {

    //write a method that takes list and print each item and total count
    public static <T> void printInfos(List<T> list){

        for (T item : list) {
            System.out.println(item);
        }

        System.out.println("Total count: " + list.size());

    }

    //write a method that takes a list, and return the last item of the list.
    public static <T> T getLastItem(List<T> list){

        return list.get(list.size()-1);
    }

}
