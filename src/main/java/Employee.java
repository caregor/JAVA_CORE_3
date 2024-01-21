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
    /**
     * Сравнивает две даты, представленные в виде строк в формате "yyyy-mm-dd".
     *
     * @param date1 Первая дата для сравнения, представленная в виде строки в формате "yyyy-mm-dd".
     * @param date2 Вторая дата для сравнения, представленная в виде строки в формате "yyyy-mm-dd".
     * @return Отрицательное целое число, если date1 меньше date2, ноль, если date1 равна date2, или положительное целое число, если date1 больше date2.
     */
    public int compareDates(String date1, String date2) {
        LocalDate localDate1 = LocalDate.parse(date1);
        LocalDate localDate2 = LocalDate.parse(date2);
        return localDate1.compareTo(localDate2);
    }

}

