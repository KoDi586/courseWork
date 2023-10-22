package OldVersion;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        EmployeeBook employeeBook = new EmployeeBook();
        {
            Employee employee = new Employee("Ivan", "Ivanov", "Ivanovich", 10_000, 2);
            Employee employee1 = new Employee("10", "20", "30", 10_000, 2);
            Employee employee2 = new Employee("100", "200", "300", 10_000, 2);
            ActionEmployee.addEmployee(employeeBook, employee);
//        System.out.println(actionEmployee.toStringAllName(EmployeeBook.employeesArray));
            ActionEmployee.addEmployee(employeeBook, employee);
            ActionEmployee.addEmployee(employeeBook, employee1);
            ActionEmployee.addEmployee(employeeBook, employee2);
        } // добавил 3-х сотрудников


        Employee employee;
        employee = ActionEmployee.findEmployee(employeeBook, "Ivan Ivanov Ivanovich");

        assert employee != null;
        System.out.println(ActionEmployee.toString(employee));

        ActionEmployee.deleteEmployee(employeeBook, "10 20 30");

        System.out.println(ActionEmployee.toStringAll(employeeBook));
    }
}