package Lab_report.Problem24;

import java.util.Scanner;

public class WaterStateChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter temperature scale (C for Celsius, F for Fahrenheit): ");
        char scale = scanner.next().charAt(0);
        scale = Character.toUpperCase(scale); // Convert to uppercase for case insensitivity

        if (scale == 'C') {
            if (temperature >= 0 && temperature <= 100) {
                System.out.println("Water is in a liquid state.");
            } else if (temperature < 0) {
                System.out.println("Water is in a solid (ice) state.");
            } else {
                System.out.println("Water is in a gaseous (steam) state.");
            }
        } else if (scale == 'F') {
            double celsiusTemperature = (temperature - 32) * 5 / 9;
            if (celsiusTemperature >= 0 && celsiusTemperature <= 100) {
                System.out.println("Water is in a liquid state.");
            } else if (celsiusTemperature < 0) {
                System.out.println("Water is in a solid (ice) state.");
            } else {
                System.out.println("Water is in a gaseous (steam) state.");
            }
        } else {
            System.out.println("Invalid temperature scale.");
        }

        scanner.close();
    }
}

