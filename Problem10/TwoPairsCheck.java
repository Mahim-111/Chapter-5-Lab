package Lab_report.Problem10;

import java.util.Scanner;

public class TwoPairsCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter four integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if ((a == b && c == d) || (a == c && b == d) || (a == d && b == c)) {
            System.out.println("two pairs");
        } else {
            System.out.println("not two pairs");
        }
    }
}

