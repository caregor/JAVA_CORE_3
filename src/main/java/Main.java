import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sergey Petrov",
                "devops",
                "+79765463452",
                BigDecimal.valueOf(100000),
                LocalDate.of(1990, 1, 1));

        Employee employee2 = new Employee("Andrey Samohin",
                "tester",
                "+79213263443",
                BigDecimal.valueOf(450000),
                LocalDate.of(1995, 3, 3));

        Manager manager = new Manager("Bill Gates",
                "manager",
                "+798165463455",
                BigDecimal.valueOf(400000),
                LocalDate.of(1974, 5, 16));

        List<Employee> employees = new ArrayList<>(Arrays.asList(employee1, employee2, manager));

        Viewer viewer = new Viewer();
        viewer.displayEmployees(employees);

        viewer.divider();

        manager.salaryIncreaseForEmployees(employees, 99);
        viewer.displayEmployees(employees);
    }
}