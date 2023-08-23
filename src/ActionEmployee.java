public class ActionEmployee {
    public static String toString(Employee employee) {
        return "First name " + employee.getFirstName() + ",\nlast name " + employee.getLastName() +
                ",\nmiddle name " + employee.getMiddleName() +
                ",\ndepartment " + employee.getDepartment() +
                ",\nSalary = " + employee.getSalary() +         //метод вывода сотрудника
                ",\nid = " + employee.getId();
    }

    public static String toStringAll(Employee[] employees) {
        String finishString = "------------------------\n";
        for (Employee test : employees) {
            finishString += toString(test) + "\n------------------------\n";
        }
                                                        //метод вывода списка сотрудников
        return finishString;
    }


    public static int sumAllSalarys(Employee[] employees) {
        int total = 0;
        for (Employee test : employees) {          //метод суммы всех зп
            total += test.getSalary();
        }
        return total;
    }


    public static Employee findMinSalary(Employee[] employees) {
        Employee minSalary = employees[0];
        for (Employee test : employees) {          //метод поиска сотрудника с мин зп
            if (test.getSalary() < minSalary.getSalary()) {
                minSalary = test;
            }
        }
        return minSalary;
    }

    public static Employee findMaxSalary(Employee[] employees) {
        Employee maxSalary = employees[0];
        for (Employee test : employees) {          //метод поиска сотрудника с макс зп
            if (test.getSalary() > maxSalary.getSalary()) {
                maxSalary = test;
            }
        }
        return maxSalary;
    }

    public static int middleSalary(Employee[] employees) {       //метод средней зп
        return (int) ((float) sumAllSalarys(employees) / (float) employees.length);
    }


    public static String toStringAllName(Employee[] employees) {
        String finishString = "--------------------\n";
        for (Employee test : employees) {                       //метод вывода Ф.И.О. всех сотрудников
            finishString += "First name " + test.getFirstName() + "," +
                    "\nLast name " + test.getLastName() +
                    ",\nMiddle name " + test.getMiddleName() +
                    "\n--------------------\n";
        }
        return finishString;
    }


    public static Employee[] changeAllSalarys(Employee[] employees, int percert) {
        for (Employee employee : employees) {
            float oldSalary = employee.getSalary();
            if (percert > 0) {
                employee.setSalary((int) (oldSalary + oldSalary * (float) percert / 100f));
            } else if (percert < 0) {
                employee.setSalary((int) (oldSalary + oldSalary * (float) percert / 100f));
            }

        }
        return employees;
    }
}
