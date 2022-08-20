import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        //Print all emails -One employee has one email -One to One
        System.out.println("********************");
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        //Print all phone numbers
        System.out.println("********************");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumber)
                .forEach(System.out::println);

        System.out.println("********************");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumber().stream())
                .forEach(System.out::println);

        System.out.println("********************");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumber)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }


}
