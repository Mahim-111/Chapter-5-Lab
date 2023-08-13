package Lab_report.Problem22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter hours worked in the past week: ");
        double hoursWorked = scanner.nextDouble();

        Paycheck employeePaycheck = new Paycheck(name, hourlyWage, hoursWorked);
        double paycheckInfo = employeePaycheck.generatePaycheck();
        System.out.println(paycheckInfo);

        scanner.close();
    }
}
