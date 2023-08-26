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
        for (Employee employee : employees) {          //метод поиска сотрудника с мин зп
            if (employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
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
    }       //учесть нулл


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


    public static Employee[] addPercentAllSalarys(Employee[] employees, int percent) {
        for (Employee employee : employees) {           //добатить процент к каждой из зп
            float oldSalary = employee.getSalary();
            if (percent > 0) {
                employee.setSalary((int) (oldSalary + oldSalary * (float) percent / 100f));
            } else if (percent < 0) {
                employee.setSalary((int) (oldSalary + oldSalary * (float) percent / 100f));
            }

        }
        return employees;
    }

    public static Employee minSalaryInDepartment(Employee[] emp, int department) {
        Employee poorEmp = emp[0];
        poorEmp.setSalary(Integer.MAX_VALUE);          //метод вывода сотрудника наименее оплачиваемого
                                                    //в департаменте
        for (Employee tast : emp) {

            if (tast.getDepartment() == department) {
                if (poorEmp.getSalary() > tast.getSalary()) {
                    poorEmp = tast;
                }
            }
        }

        if (poorEmp.getSalary() == 2147483647) {
            System.out.println("Сотрудник ввыведен не кореектно, тк данный отдел пустой!");
        }
        return poorEmp;
    }

    public static Employee maxSalaryInDepartment(Employee[] emp, int department) {
        Employee richEpm = emp[0];
        richEpm.setSalary(Integer.MIN_VALUE);          //метод вывода сотрудника самого оплачиваемого в департ.

        for (Employee tast : emp) {

            if (tast.getDepartment() == department) {
                if (richEpm.getSalary() < tast.getSalary()) {
                    richEpm = tast;
                }
            }
        }
        if (richEpm.getSalary() == -1) {
            System.out.println("Сотрудник ввыведен не кореектно, тк данный отдел пустой!");
        }
        return richEpm;
    }

    public static int sumDepartmentSalarys(Employee[] emp, int department) {
        int total = 0;
        for (Employee tast : emp) {
            if (tast.getDepartment() == department) {           // сумма зарплат департамента
                total += tast.getSalary();
            }

        }
        return total;
    }

    public static int middleSalaryInDepartment(Employee[] emp, int department) {
        int count = 0;                                      //средняя зарплата по департаменту
        for (Employee tast : emp) {
            if (tast.getDepartment() == department) {
                count++;
            }
        }
        return (int) ((float) sumDepartmentSalarys(emp, department) / (float) count);
    }

    public static Employee[] multiplyPercentDepartmentsSalarys(Employee[] employees, int department, float percent) {
        for (Employee emp : employees) {           //добатить процент к каждой из зп департамента

            if (emp.getDepartment() == department) {

                float oldSalary = emp.getSalary();
                if (percent > 0) {
                    emp.setSalary((int) (oldSalary * percent));
                }
            }


        }
        return employees;
    }


}
