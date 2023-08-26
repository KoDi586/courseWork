package skyPro.course.one.courseWork;

public class ActionEmployee {
    public static String toString(Employee employee) {
        return "First name " + employee.getFirstName() + ",\nlast name " + employee.getLastName() +
                ",\nmiddle name " + employee.getMiddleName() +
                ",\ndepartment " + employee.getDepartment() +
                ",\nSalary = " + employee.getSalary() +
                ",\nid = " + employee.getId();
    }

    public static String toStringAll(Employee[] employees) {
        String finishString = "------------------------\n";
        for (Employee test : employees) {
            finishString += toString(test) + "\n------------------------\n";
        }
        return finishString;
    }


    public static int sumAllSalarys(Employee[] employees) {
        int total = 0;
        for (Employee test : employees) {
            total += test.getSalary();
        }
        return total;
    }


    public static Employee findMinSalary(Employee[] employees) {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }

    public static Employee findMaxSalary(Employee[] employees) {
        Employee maxSalary = employees[0];
        for (Employee test : employees) {
            if (test.getSalary() > maxSalary.getSalary()) {
                maxSalary = test;
            }
        }
        return maxSalary;
    }

    public static int middleSalary(Employee[] employees) {
        return (int) ((float) sumAllSalarys(employees) / (float) employees.length);
    }

    public static String toStringAllName(Employee[] employees) {
        String finishString = "--------------------\n";
        for (Employee test : employees) {
            finishString += "First name " + test.getFirstName() + "," +
                    "\nLast name " + test.getLastName() +
                    ",\nMiddle name " + test.getMiddleName() +
                    "\n--------------------\n";
        }
        return finishString;
    }
}
