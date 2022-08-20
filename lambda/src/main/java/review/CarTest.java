package review;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Toyota",140,1998));
        carList.add(new Car("Audi",200,2008));
        carList.add(new Car("BMW",210,2020));
        carList.add(new Car("Nissan",150,2018));

        //list of fast cars
        CarFastPredicate fastPredicate = new CarFastPredicate();
        List<Car> fastCarList = filterCars(carList,fastPredicate);
        System.out.println(fastCarList);

        List<Car> newCarList = filterCars(carList, new CarNewPredicate());
        System.out.println(newCarList);

        //durable car, --make toyota
        List<Car> durableCarList = filterCars(carList, new CarDurablePredicate());
        System.out.println(durableCarList);


        CarPredicate newCarLambda = (Car car) -> car.getYear() > 2015;
        List<Car> newCarListLambda = filterCars(carList, newCarLambda);
        System.out.println(newCarListLambda);

        //if you only have one param you don't need parenthesis
        CarPredicate fastCarLambda = car -> car.getTopSpeed()>160;
        List<Car> fastCarListLambda = filterCars(carList, newCarLambda);
        System.out.println(fastCarListLambda);

    }

    private static List<Car> filterCars(List<Car> carList, CarPredicate carPredicate) {

        List<Car> result = new ArrayList<>();

        for (Car car : carList) {
            if(carPredicate.test(car)){
                result.add(car);
            }

        }

        return result;
    }
}
