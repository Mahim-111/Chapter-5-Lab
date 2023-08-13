package Lab_report.Problem21;

public class Month {

    public static int getLength(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            return -1;
        }

        int days = 31;

        boolean is30Days = monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11;
        boolean isFebruary = monthNumber == 2;

        if (is30Days) {
            days = 30;
        } else if (isFebruary) {
            days = 28;
        }

        return days;
    }

}
