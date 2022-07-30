package review;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) throws Exception {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike",101));
        studentList.add(new Student("Joe",102));
        studentList.add(new Student("Adam",103));
        studentList.add(new Student("Ozzy",103));

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher("Albus",201));
        teacherList.add(new Teacher("Severus",202));
        teacherList.add(new Teacher("Hagrid",202));

        //printInfo(studentList);

        //printInfos(studentList);
        //printInfos(teacherList);

        //System.out.println(getLastItem(studentList).getName());
        //System.out.println(getLastItem(teacherList).getName());

        MyUtils<Student> obj1 = new MyUtils<>();

        obj1.printInfos(studentList);
        System.out.println(obj1.getLastItemName(studentList));


        MyUtils<Teacher> obj2 = new MyUtils<>();
        System.out.println(obj2.getLastItem(teacherList).getName());

        MyUtils<String> obj3 = new MyUtils<>();


    }

    //write a method takes list of students, print each student and total count

    public static void printInfo(List<Student> students){

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Total count: "+ students.size());
    }

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
