package Lab_report.Problem8;

import java.util.Scanner;

public class NumberOrderWithMode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 'strict' for strict mode or 'lenient' for lenient mode:");
        String mode = scanner.nextLine();

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();

        if ("strict".equalsIgnoreCase(mode)) {
            if (num1 < num2 && num2 < num3) {
                System.out.println("Increasing");
            } else if (num1 > num2 && num2 > num3) {
                System.out.println("Decreasing");
            } else {
                System.out.println("Neither");
            }
        } else if ("lenient".equalsIgnoreCase(mode)) {
            if (num1 <= num2 && num2 <= num3) {
                System.out.println("Increasing");
            } else if (num1 >= num2 && num2 >= num3) {
                System.out.println("Decreasing");
            } else {
                System.out.println("Neither");
            }
        } else {
            System.out.println("Invalid mode entered.");
        }
    }
}

