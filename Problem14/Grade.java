package Lab_report.Problem14;

public class Grade {
    public static String getLetterGrade(double number) {
        String letterGrade;

        if (number >= 3.85) {
            letterGrade = "A+";
        }
        else if (number >= 3.5) {
            letterGrade = "A";
        }
        else if (number >= 3.15) {
            letterGrade = "A-";
        }
        else if (number >= 2.85) {
            letterGrade = "B";
        }
        else if (number >= 2.5) {
            letterGrade = "C";
        }
        else if (number >= 2.15) {
            letterGrade = "C-";
        }
        else if (number >= 1.85) {
            letterGrade = "D";
        }
        else {
            letterGrade = "F";
        }

        return letterGrade;
    }
}

