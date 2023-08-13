package Lab_report.Problem11;

import java.util.Scanner;

public class CompassDirection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculate obj = new Calculate();
        System.out.print("Enter the angle in degrees: ");
        int angle = scanner.nextInt();

        // Normalize the angle to be within [0, 360)
        angle = (angle % 360 + 360) % 360;

        // Calculate the nearest direction
        String direction = obj.calculateDirection(angle);

        System.out.println("Nearest compass direction: " + direction);
    }

}
