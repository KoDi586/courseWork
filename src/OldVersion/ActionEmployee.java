package OldVersion;

public class ActionEmployee {
    public static String toString(Employee employee) {
        return "First name " + employee.getFirstName() +
                ",\nlast name " + employee.getLastName() +
                ",\nmiddle name " + employee.getMiddleName() +
                ",\ndepartment " + employee.getDepartment() +
                ",\nSalary = " + employee.getSalary() +         //метод вывода сотрудника
                ",\nid = " + employee.getId();
    }

    public static String toStringAll(EmployeeBook employees) {
        StringBuilder finishString = new StringBuilder("------------------------\n");
        for (Employee employee : employees.getEmployeesMap().values()) {
            finishString.append(toString(employee)).append("\n------------------------\n");
        }
        //метод вывода списка сотрудников
        return finishString.toString();
    }

    public static int sumAllSalarys(EmployeeBook employees) {
        int total = 0;
        for (Employee test : employees.getEmployeesMap().values()) {          //метод суммы всех зп
            total += test.getSalary();
        }
        return total;
    }

    public static Employee findMinSalary(EmployeeBook employees) {
        int minSalary = Integer.MAX_VALUE;
        Employee cheapEmployee = null;
        for (Employee employee : employees.getEmployeesMap().values()) {
            if (employee.getSalary() <= minSalary) {
                minSalary = employee.getSalary();
                cheapEmployee = employee;
            }
        }

        try {
            return cheapEmployee;
        } catch (Exception e) {
            throw new RuntimeException("Сотрудников нет!");
        }
    }

    public static Employee findMaxSalary(EmployeeBook employees) {
        int maxSalary = Integer.MIN_VALUE;
        Employee richEmployee = null;
        for (Employee employee : employees.getEmployeesMap().values()) {
            if (employee.getSalary() >= maxSalary) {
                maxSalary = employee.getSalary();
                richEmployee = employee;
            }
        }

        try {
            return richEmployee;
        } catch (Exception e) {
            throw new RuntimeException("Сотрудников нет!");
        }
    }

    public static int middleSalary(EmployeeBook employees) {       //метод средней зп
        return (int) ((float) sumAllSalarys(employees) / (float) employees.getEmployeesMap().values().size());
    }       //учесть нулл

    public static String toStringAllName(EmployeeBook employees) {
        StringBuilder finishString = new StringBuilder("--------------------\n");
        for (Employee employee : employees.getEmployeesMap().values()) {
            finishString.append("First name ").append(employee.getFirstName())
                    .append(",").append("\nLast name ").append(employee.getLastName())
                    .append(",\nMiddle name ").append(employee.getMiddleName())
                    .append("\n--------------------\n");
        }
        return finishString.toString();         //метод вывода Ф.И.О. всех сотрудников
    }

    public static EmployeeBook addPercentAllSalarys(EmployeeBook employees, int percent) {
        for (Employee employee : employees.getEmployeesMap().values()) {           //добатить процент к каждой из зп
            float oldSalary = employee.getSalary();
            if (percent > 0) {
                employee.setSalary((int) (oldSalary + oldSalary * (float) percent / 100f));
            } else if (percent < 0) {
                employee.setSalary((int) (oldSalary + oldSalary * (float) percent / 100f));
            }

        }
        return employees;
    }

    public static Employee minSalaryInDepartment(EmployeeBook emp, int department) {
        Employee poorEmp = null;
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : emp.getEmployeesMap().values()) {
            if (employee.getDepartment() == department & minSalary >= employee.getSalary()) {
                minSalary = employee.getSalary();
                poorEmp = employee;
            }
        }

        if (minSalary == Integer.MAX_VALUE) {
            System.out.println("Сотрудник ввыведен не кореектно, тк данный отдел пустой!");
        }
        return poorEmp;
    }

    public static Employee maxSalaryInDepartment(EmployeeBook emp, int department) {
        Employee richEmp = null;
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : emp.getEmployeesMap().values()) {
            if (employee.getDepartment() == department & maxSalary <= employee.getSalary()) {
                maxSalary = employee.getSalary();
                richEmp = employee;
            }
        }

        if (maxSalary == Integer.MIN_VALUE) {
            System.out.println("Сотрудник ввыведен не кореектно, тк данный отдел пустой!");
        }
        return richEmp;
    }

    public static int sumDepartmentSalarys(EmployeeBook emp, int department) {
        int total = 0;
        for (Employee employee : emp.getEmployeesMap().values()) {
            if (employee.getDepartment() == department) {           // сумма зарплат департамента
                total += employee.getSalary();
            }
        }
        return total;
    }

    public static int middleSalaryInDepartment(EmployeeBook emp, int department) {
        int count = 0;                                      //средняя зарплата по департаменту
        for (Employee tast : emp.getEmployeesMap().values()) {
            if (tast.getDepartment() == department) {
                count++;
            }
        }
        return (int) ((float) sumDepartmentSalarys(emp, department) / (float) count);
    }

    public static EmployeeBook multiplyPercentDepartmentsSalarys
            (EmployeeBook employees, int department, float percent) {

        for (Employee emp : employees.getEmployeesMap().values()) {           //добатить процент к каждой из зп департамента
            if (emp.getDepartment() == department) {
                float oldSalary = emp.getSalary();
                if (percent > 0) {
                    emp.setSalary((int) (oldSalary * percent));
                }
            }
        }
        return employees;
    }

    public static void addEmployee(EmployeeBook employeeMap, Employee employee) {
        employeeMap.put(employee.getFirstName() + " " + employee.getLastName() +
                " " + employee.getMiddleName(), employee);
    }

    public static void deleteEmployee(EmployeeBook employeeMap, String name) {
        if (employeeMap.getAllEmployeeName().contains(name)) {
            employeeMap.getEmployeesMap().remove(name);
        } else {
            System.out.println("такого сотрудника итак нет");
        }

    }

    public static Employee findEmployee(EmployeeBook employeeMap, String name) {
        if (employeeMap.getAllEmployeeName().contains(name)) {
            return employeeMap.getEmployeesMap().get(name);
        } else {
            System.out.println("сотрудник не найден");
            return null;
        }
    }


}
