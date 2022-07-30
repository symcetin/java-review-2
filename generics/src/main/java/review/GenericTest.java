package review;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike",101));
        studentList.add(new Student("Joe",102));
        studentList.add(new Student("Adam",103));

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher("Albus",201));
        teacherList.add(new Teacher("Severus",202));

        //printInfo(studentList);

        printInfos(studentList);
        printInfos(teacherList);
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


}