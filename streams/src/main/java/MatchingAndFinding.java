import java.util.Optional;

public class MatchingAndFinding {

    public static void main(String[] args) {

        //All Match
        System.out.println("All Match");
        boolean isHealty = DishData.getAll().stream().allMatch(dish ->dish.getCalories()<1000);
        System.out.println(isHealty);

        //Any Match
        System.out.println("Any Match");
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian))
            System.out.println("The menu is vegetarian friendly");

        //None Match
        System.out.println("None Match");
        boolean isHealty2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealty2);

        //Find Any
        System.out.println("Find any");
        Optional<Dish> dish = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish.get());

        //Find First
        System.out.println("Find first");
        Optional<Dish> dish2 = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish2.get());


    }
}
