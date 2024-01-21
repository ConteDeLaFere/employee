import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int n = 10;
        Employee[] employees = new Employee[n];
        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 80000);
        employees[1] = new Employee("Петров", "Петр", "Петрович", 2, 100000);
        employees[2] = new Employee("Кузнецова", "Елена", "Александровна", 3, 90000);
        employees[3] = new Employee("Попова", "Екатерина", "Юрьевна", 4, 120000);
        employees[4] = new Employee("Храбров", "Алексей", "Анатольевич", 5, 100000);
        employees[5] = new Employee("Чернов", "Кирилл", "Александрович", 2, 110000);
        employees[6] = new Employee("Романова", "Светлана", "Алексеевна", 4, 70000);
        employees[7] = new Employee("Синицын", "Сергей", "Николаевич", 1, 130000);
        employees[8] = new Employee("Cпицын", "Вячеслав", "Андреевич", 5, 90000);
        employees[9] = new Employee("Некрасова", "Елизавета", "Анатольевна", 1, 140000);
        System.out.println(Arrays.toString(getEmployeesFullName(employees)));
    }

    static void getListOfEmployees(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    static int getSalaryCost(Employee[] employees) {
        int sum = 0;
        for (Employee e : employees) {
            sum += e.getSalary();
        }
        return sum;
    }

    static Employee getEmployeeWithMinSalary(Employee[] employees) {
        Employee employeeWithMinSalary = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = e;
            }
        }
        return employeeWithMinSalary;
    }

    static Employee getEmployeeWithMaxSalary(Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = e;
            }
        }
        return employeeWithMaxSalary;
    }

    static double getAverageSalary(Employee[] employees) {
        return 1.0 * getSalaryCost(employees) / employees.length;
    }

    static String[] getEmployeesFullName(Employee[] employees) {
        String[] names = new String[employees.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = employees[i].getLastName() +  " " + employees[i].getFirstName()
                    + " " + employees[i].getMiddleName();
        }
        return names;
    }
}
