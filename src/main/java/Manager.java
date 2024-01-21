import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Manager extends Employee{

    public Manager(String fio, String position, String phone, BigDecimal salary, LocalDate birthDate) {
        super(fio, position, phone, salary, birthDate);
    }

    public void salaryIncreaseForEmployees(List<Employee> employees, int bonusValue) {
        BigDecimal salary;
        for (Employee employee : employees) {
            if  (!(employee instanceof Manager)) {
                salary = employee.getSalary();
                salary = salary.add(BigDecimal.valueOf(bonusValue));
                employee.setSalary(salary);
            }
        }
    }
}
