package review;

import java.util.List;

public class MyUtils <T> {

    //write a method that takes list and print each item and total count
    public void printInfos(List<T> list){

        for (T item : list) {
            System.out.println(item);
        }

        System.out.println("Total count: " + list.size());

    }

    //write a method that takes a list, and return the last item of the list.
    public T getLastItem(List<T> list){

        return list.get(list.size()-1);
    }

    //write a method that takes list, return last item - name (Student,Teacher)
    //String , getName()
    //instance of

    public String getLastItemName(List<T> list) throws Exception {

        T lastItem = list.get(list.size() - 1);
        if(lastItem instanceof Student){
            return ((Student) lastItem).getName();
        }else if(lastItem instanceof Teacher){
            return  ((Teacher) lastItem).getName();
        }else {
            throw new Exception("Some Error");
        }

    }




}
