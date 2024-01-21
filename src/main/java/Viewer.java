import java.util.List;

public class Viewer {

    /**
     * Выводит информацию о сотрудниках.
     *
     * @param employees Список сотрудников для отображения.
     */
    public void displayEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            employee.printInfo();
        }
    }

    /**
     * Вставляет пустую строчку.
     */
    public void divider() {
        System.out.println();
    }
}
