import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String FIO;
    private String position;
    private String phone;
    private BigDecimal salary;
    private LocalDate birthDate;


    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

//    @Override
//    public String toString() {
//
//        return String.format("%s - %s , phone - %s ,salary - %s, age - %s", FIO, position, phone, salary, this.getAge());
//    }

    public void printInfo() {
        System.out.println(this);
    }

    public void increaseSalary(int value) {
        this.salary = salary.add(BigDecimal.valueOf(value));
    }

}

