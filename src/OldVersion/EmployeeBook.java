package OldVersion;

import java.util.*;

public class EmployeeBook {
    private Map<String, Employee> employeesMap = new HashMap<>();
    private Set<String> allEmployeeName = new HashSet<>();

    public Set<String> getAllEmployeeName() {
        return allEmployeeName;
    }

    public void put(String str, Employee employee) {
        if (!employeesMap.containsKey(str)) {
            this.employeesMap.put(str, employee);
            this.allEmployeeName.add(str);
        }
    }

    public Map<String, Employee> getEmployeesMap() {
        return employeesMap;
    }
}
