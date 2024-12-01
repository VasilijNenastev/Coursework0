import java.util.ArrayList;

public class EmployeeBook {
    private final Employee[] employees = new Employee[10];
    private int Counter = 0;
    {
        employees[0] = new Employee(1, "Иванов", "Иван", "Иванович", 150000);
        employees[1] = new Employee(2, "Петров", "Петр", "Петрович", 140000);
        employees[2] = new Employee(3, "Шишкин", "Михаил", "Валентинович", 100000);
        employees[3] = new Employee(3, "Травинова", "Ирина", "Семеновна", 104000);
        employees[4] = new Employee(4, "Сидорова", "Кристина", "Дмитриевна", 110000);
        employees[5] = new Employee(1, "Тушкевич", "Максим", "Николаевич", 142000);
        employees[6] = new Employee(5, "Крутов", "Дмитрий", "Григорьевич", 180000);
        employees[7] = new Employee(5, "Харитонов", "Илья", "Владимирович", 155000);
        employees[8] = new Employee(2, "Кругляшова", "Ирина", "Борисовна", 145210);
        employees[9] = new Employee(4, "Карапетян", "Марина", "Давидовна", 98520);

    }



    public void printAllEmployee() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee);
        }

    }

    public double getSalaryPerMonth() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
        }
        return sum;
    }

    public Employee[] findEmployeeInDepartment(int department) {
        ArrayList<Employee> employeesInDepartment = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                employeesInDepartment.add(employee);
            }
        }
        return employeesInDepartment.toArray(new Employee[0]);
    }

    public double getSalaryPerMonthInDepartment(int department) {
        double sum = 0;
        Employee[] employeesInDepartment = findEmployeeInDepartment(department);
        for (Employee employee : employeesInDepartment) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public double calculateAverageSalary() {
        return getSalaryPerMonth() / employees.length;

    }

    public void printAllNames() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee.printName());
        }
    }

    public Employee findEmployeeWithMinSalary() {
        Employee targetEmployee = createTargetEmployee();
        targetEmployee.setSalary(Double.MAX_VALUE);
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() < targetEmployee.getSalary()) {
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }


    public Employee findEmployeeWithMaxSalary() {

        Employee targetEmployee = createTargetEmployee();
        targetEmployee.setSalary(Double.MIN_VALUE);
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() > targetEmployee.getSalary()) {
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }
    public double calculateAverageSalaryInDepartment(int department) {
        Employee[] employeeInDepartment = findEmployeeInDepartment(department);
        if (employeeInDepartment.length == 0) {
            return 0;
        }
        return getSalaryPerMonthInDepartment(department) / employeeInDepartment.length;
    }



    private Employee createTargetEmployee() {
        return new Employee(2, null, null, null, 0);
    }

}
