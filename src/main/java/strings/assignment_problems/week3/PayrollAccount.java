
package strings.assignment_problems.week3;

public class PayrollAccount {
    private double basicSalary;
    private double bonus;

    public PayrollAccount(double basicSalary, double bonus) {
        if (basicSalary < 0 || bonus < 0) {
            throw new IllegalArgumentException("Salary and bonus cannot be negative");
        }

        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public void creditBonus(double amount) {
        if (amount > 0) {
            bonus += amount;
        } else {
            System.out.println("Bonus must be positive");
        }
    }

    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Invalid tax percentage");
            return;
        }

        basicSalary -= basicSalary * percent / 100;
    }

    public double getNetSalary() {
        return basicSalary + bonus;
    }

    public static void main(String[] args) {
        PayrollAccount account = new PayrollAccount(50000, 0);

        account.creditBonus(5000);
        account.deductTax(10);

        System.out.println("Net salary: " + account.getNetSalary());
    }
}
