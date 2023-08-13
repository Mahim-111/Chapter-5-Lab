package Lab_report.Problem14;

import java.util.Scanner;

public class NumberToLetterGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 4: ");
        double number = scanner.nextDouble();

        String letterGrade = Grade.getLetterGrade(number);
        System.out.println("The letter grade is: " + letterGrade);
    }
}
