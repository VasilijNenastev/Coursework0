public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();


        System.out.println("=========================================================================");
        System.out.println("Полный список сотрудников: ");
        employeeBook.printAllEmployee();
        System.out.println("=========================================================================");
        System.out.println("Сумма зарплат всех сотрудников составляет: "
                + employeeBook.getSalaryPerMonth() + " рублей.");
        System.out.println("=========================================================================");
        System.out.println("Сумма зарплат работников департамента составляет: "
                + employeeBook.getSalaryPerMonthInDepartment(2)+" рублей");//указать номер департамента от 1 до 5//
        System.out.println("=========================================================================");
        System.out.println("Средняя зарплата по предприятию составляет: "
                + employeeBook.calculateAverageSalary() + "  рублей.");
        System.out.println("=========================================================================");
        System.out.println("ФИО Сотрудников:");
        employeeBook.printAllNames();
        System.out.println("=========================================================================");
        System.out.println("Минимальная зарплата по предприятию составляет: "
                + employeeBook.findEmployeeWithMinSalary() + " рублей");
        System.out.println("=========================================================================");
        System.out.println("Максимальная зарплата по предприятию составляет: "
                + employeeBook.findEmployeeWithMaxSalary() + " рублей");
        System.out.println("=========================================================================");
        System.out.println("Средняя зарплата работников департамента составляет: "
                + employeeBook.calculateAverageSalaryInDepartment(4)+" рублей");//указать номер департамента от 1 до 5//
        System.out.println("=========================================================================");
    }
}