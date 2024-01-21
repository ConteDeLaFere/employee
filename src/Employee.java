public class Employee {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private int department;
    private int salary;
    private static int id;

    public Employee(String lastName, String firstName, String middleName, int department, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        ++id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public static int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ФИО: " + lastName + " " + firstName + " " + middleName + '\n' +
                "Отдел: " + department + '\n' +
                "Зарплата: " + salary;
    }
}
