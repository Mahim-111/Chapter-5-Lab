package Lab_report.Problem13;
public class Grade {
    public static double getNumericGrade(char letterGrade) {
        double numericGrade;
        switch (letterGrade) {
            case 'A':
                numericGrade = 4.0;
                break;
            case 'B':
                numericGrade = 3.0;
                break;
            case 'C':
                numericGrade = 2.0;
                break;
            case 'D':
                numericGrade = 1.0;
                break;
            case 'F':
                numericGrade = 0.0;
                break;
            default:
                System.out.println("Invalid letter grade.");
                return -1.0;
        }
        return numericGrade;
    }
}








