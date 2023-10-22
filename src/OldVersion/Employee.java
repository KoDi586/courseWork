package OldVersion;

public class Employee {

    private static int counter = 1;

    private final String firstName;
    private final String lastName;
    private final String middleName;
    private int salary;
    private int department;
    private final int id;


    public Employee(String firstName, String lastName, String middleName, int salary, int department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;               //constructor
        this.salary = salary;
        this.department = department;
        id = counter++;

    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return counter;
    }
}