import java.util.List;

import static java.util.Comparator.comparing;

public class DishTask {

    public static void main(String[] args) {

        List<Dish> myDishList = DishData.getAll();


        //Print all dish's name that has less than 400 calories
        System.out.println("TASK 1");
        myDishList.stream()
                .filter(dish -> dish.getCalories() < 400)
                .map(name -> name.getName())
                .forEach(System.out::println);
        //Another way
        System.out.println("***********************");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);



        //Print the length of the name of the each dish
        System.out.println("TASK 2");
        myDishList.stream()
                .map(name -> name.getName().length())
                .forEach(System.out::println);

        //Another way
        System.out.println("***********************");
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        //Print three high caloric dish name(>300)
        System.out.println("***********************");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3).forEach(System.out::println);

        //Print all dish name that are below 400 calories in sorted
        System.out.println("***********************");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);
    }
}
