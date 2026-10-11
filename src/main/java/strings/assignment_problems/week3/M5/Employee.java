
package strings.assignment_problems.week3.M5;

public class Employee {
    private String name;
    private double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateGrossSalary() {
        return basicSalary + (basicSalary * 0.20)
                + (basicSalary * 0.10);
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Arun", 30000);
        emp.displayDetails();
    }
}
