import java.util.Arrays;
import java.util.List;

public class StateTask {

    public static void main(String[] args) {
        //Suppose we have a State class that contains list of cities. Create a list
        //of States and print all the cities.

        State oh = new State();
        oh.addCity("Cleveland");
        oh.addCity("Columbus");
        oh.addCity("Mayfield");
        oh.addCity("Dublin");

        State tx = new State();
        tx.addCity("Austin");
        tx.addCity("Dallas");
        tx.addCity("Houston");
        tx.addCity("Corpus");

        List<State> list = Arrays.asList(oh,tx);

//        list.stream().map(state -> state.getCity()).forEach(System.out::println);
        list.stream()
                .map(state -> state.getCities())
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
