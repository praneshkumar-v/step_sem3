package strings.assignment_problems;

import java.util.Scanner;

public class AtmPinValidator {

    public static boolean validatePin(String pin) {
        return pin != null && pin.matches("[0-9]{4}");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your ATM PIN: ");
        String pin = sc.nextLine();

        if (validatePin(pin)) {
            System.out.println("Valid ATM PIN");
        } else {
            System.out.println("Invalid ATM PIN");
        }

        sc.close();
    }
}
