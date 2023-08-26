public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {

//        Employee[] employeesArray = new Employee[10];

        for (int i = 0; i < 10; i++) {  //latter delite
            Employee create = new Employee("first" + i, "last" + i, "Middle" + i, 1000 * (i + 1), (int) (i + 2) / 2);
//            EmployeeBook.employeesArray[i] = create;
        }

        ActionEmployee actionEmployee = new ActionEmployee();


//        Employee[] e = actionEmployee.multiplyPercentDepartmentsSalarys(employeesArray, 1, 1.1f);
//        System.out.println(actionEmployee.toStringAll(e));
//        System.out.println(actionEmployee.toString(e));
//        System.out.println(actionEmployee.toStringAll(employeesArray));
//        Employee[] e = actionEmployee.addPercentAllSalarys(employeesArray, -10);
//        System.out.println(actionEmployee.toStringAll(e));

//        System.out.println(actionEmployee.toStringAllName(employeesArray));

//        System.out.println(actionEmployee.sumAllSalarys(employeesArray));
//        System.out.println("actionEmployee.middleSalary(employeesArray) = " + actionEmployee.middleSalary(employeesArray));

//        Employee employeeWithMaxSalary = actionEmployee.findMaxSalary(employeesArray);
//        System.out.println(actionEmployee.toString(employeeWithMaxSalary));

//        System.out.println(actionEmployee.sumAllSalarys(employeesArray));

//        System.out.println(ActionEmployee.toStringArray(employeesArray));

//        System.out.println(actionEmployee.toString(employeesArray[9]));

//        System.out.println("employeesArray[3].getId() = " + employeesArray[3].getId());

    }
}