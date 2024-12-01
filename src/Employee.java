import java.util.Objects;

public class Employee {
    private static final int minDepartmentNumber = 1;
    private static final int maxDepartmentNumber = 5;
    private final String firstName;
    private final String lastName;
    private final String secondName;
    private double salary;
    private int department;
    private static int Counter;
    private int Id;

    public int getId() {
        return this.Id;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int department, String lastName, String firstName, String secondName, double salary) {
        if (department < minDepartmentNumber || department > maxDepartmentNumber) {
            throw new IllegalArgumentException("Номер отдела должен быть от 1 до 5. Текущий номер: " + department);
        } else {
            this.department = department;
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.salary = salary;
        Id = ++Counter;

    }

    @Override
    public String toString() {
        if (secondName == null) {
            return "ID: " + Id + ", Департамент: " + department + ", Фамилия: " + lastName + "Имя: " + firstName +
                    "Заработная плата: " + salary;
        }
        return "ID: " + Id + ", Департамент: " + department + ", Фамилия: " + lastName + ", Имя: " + firstName + ", Отчество: " + secondName +
                ", Заработная плата: " + salary;
    }

    public String printName() {
        if (secondName == null) {
            return "Фамилия: " + lastName + " Имя: " + firstName;
        }
        return "Фамилия: " + lastName + " Имя: " + firstName + " Отчество: " + secondName;
    }

    public String printData() {
        if (secondName == null) {
            return "ID: " + Id + " Фамилия: " + lastName + " Имя: " + firstName + " Зарплата: " + salary;
        }
        return "ID: " + Id + " Фамилия: " + lastName + " Имя: " + firstName + " Отчество: " + secondName + " Зарплата: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && department == employee.department && Id == employee.Id && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(secondName, employee.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, secondName, salary, department, Id);
    }
}

