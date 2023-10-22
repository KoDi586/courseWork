package OldVersion;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        ActionEmployee actionEmployee = new ActionEmployee();
        EmployeeBook employeeBook = new EmployeeBook();
        Employee employee = new Employee("1", "2", "3", 10_000,2);
        actionEmployee.addEmployee(employeeBook, employee);
//        System.out.println(actionEmployee.toStringAllName(EmployeeBook.employeesArray));

    }
}