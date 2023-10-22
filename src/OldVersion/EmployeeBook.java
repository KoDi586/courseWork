package OldVersion;

import java.util.*;

public class EmployeeBook {
    private Map<String, Employee> employeesMap = new HashMap<>();
//    private Set<Employee> allEmployee = new HashSet<>();

//    public Set<Employee> getAllEmployee() {
//        return allEmployee;
//    }

    public Set<String> getAllEmployeeName() {
        return allEmployeeName;
    }

    private Set<String> allEmployeeName = new HashSet<>();

    public void put(String str, Employee employee) {
        this.employeesMap.put(str, employee);
        this.allEmployeeName.add(str);
    }

    public Map<String, Employee> getEmployeesMap() {
        return employeesMap;
    }
}
