package Lab_report.Problem19;

import java.util.Scanner;

public class DecimalComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two floating-point numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        if (areEqualUpToTwoDecimals(num1, num2)) {
            System.out.println("They are the same up to two decimal places.");
        } else {
            System.out.println("They are different.");
        }
    }

    public static boolean areEqualUpToTwoDecimals(double num1, double num2) {
        // Multiply both numbers by 100 to shift two decimal places to the left
        int intNum1 = (int) (num1 * 100);
        int intNum2 = (int) (num2 * 100);
        while(intNum1>100){
            intNum1 = intNum1 / 10;
        }while(intNum2>100){
            intNum2 = intNum2 / 10;
        }

        return intNum1 == intNum2;
    }
}
