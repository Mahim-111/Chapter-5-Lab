package Lab_report.Problem21;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month: ");
        int monthNumber = scanner.nextInt();

        int days = Month.getLength(monthNumber);

        if (days == -1) {
            System.out.println("Invalid month number.");
        } else {
            System.out.println(days + " days");
        }
    }
}
