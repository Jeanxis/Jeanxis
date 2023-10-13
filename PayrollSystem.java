import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Payroll System");

        // Employee information
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee position: ");
        String position = scanner.nextLine();

        System.out.print("Enter employee department: ");
        String department = scanner.nextLine();

        // Days worked
        System.out.print("Enter the number of days worked: ");
        int daysWorked = scanner.nextInt();

        // Salary information
        System.out.print("Enter daily pay: $");
        double dailyPay = scanner.nextDouble();

        // Calculate basic pay
        double basicPay = daysWorked * dailyPay;

        System.out.print("Enter overtime hours: ");
        double overtimeHours = scanner.nextDouble();

        // Calculate overtime pay
        double overtimePay = overtimeHours * 1.5 * dailyPay;

        // Calculate gross salary
        double grossSalary = basicPay + overtimePay;

        // Calculate tax deduction (1.5% of gross salary)
        double taxDeduction = 0.015 * grossSalary;

        // Calculate net salary
        double netSalary = grossSalary - taxDeduction;

        // Mode of payment
        System.out.print("Select mode of payment (1 - Direct Deposit, 2 - Check): ");
        int paymentMode = scanner.nextInt();
        String paymentMethod = (paymentMode == 1) ? "Direct Deposit" : "Check";

        // Display the payslip
        System.out.println("\nEmployee Payslip");
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Department: " + department);
        System.out.println("Number of Days Worked: " + daysWorked);
        System.out.println("Basic Pay: $" + basicPay);
        System.out.println("Overtime Pay: $" + overtimePay);
        System.out.println("Gross Salary: $" + grossSalary);
        System.out.println("Tax Deduction (1.5% of Gross Salary): $" + taxDeduction);
        System.out.println("Net Salary: $" + netSalary);
        System.out.println("Payment Method: " + paymentMethod);

        scanner.close();
    }
}
