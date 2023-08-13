package Lab_report.Problem25;

import java.util.Scanner;

public class WaterStateAltitudeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter temperature scale (C for Celsius, F for Fahrenheit): ");
        char scale = scanner.next().charAt(0);
        scale = Character.toUpperCase(scale);

        System.out.print("Enter altitude value: ");
        double altitude = scanner.nextDouble();

        double boilingPointAdjustment = 0;

        if (altitude >= 0) {
            boilingPointAdjustment = altitude / 300;
        } else {
            boilingPointAdjustment = altitude / 1000;
        }

        double adjustedBoilingPoint = 100 - boilingPointAdjustment;

        if (scale == 'F') {
            adjustedBoilingPoint = (adjustedBoilingPoint * 9 / 5) + 32;
        }

        if (temperature <= adjustedBoilingPoint) {
            System.out.println("Water is in a liquid state.");
        } else if (temperature > adjustedBoilingPoint) {
            System.out.println("Water is in a gaseous (steam) state.");
        }

        scanner.close();
    }
}

