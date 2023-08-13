package Lab_report.Problem17;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double largest = findLargest(num1, num2, num3);

        System.out.println("The largest number is " + largest);
    }

    public static double findLargest(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
    }
}

