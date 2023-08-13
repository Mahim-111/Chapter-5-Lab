package Lab_report.Problem13;

import java.util.Scanner;

public class GradeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        char letterGrade = scanner.next().toUpperCase().charAt(0);

        double numericGrade = Grade.getNumericGrade(letterGrade);

        if (numericGrade != -1.0) {
            System.out.println("The numeric value is " + numericGrade);
        }
    }
}
