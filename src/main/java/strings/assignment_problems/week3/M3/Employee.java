
package strings.assignment_problems.week3.M3;

public class Employee {
    int empId;
    String empName;
    double salary;
    boolean isIntern;

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    public Employee(int empId, String empName) {
        this(empId, empName, 15000.0);
        this.isIntern = true;
    }

    public void printProfile() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Intern: " + isIntern);
    }

    public static void main(String[] args) {
        Employee permanent = new Employee(101, "Divya", 50000);
        Employee intern = new Employee(102, "Arjun");

        permanent.printProfile();
        System.out.println();
        intern.printProfile();
    }
}
