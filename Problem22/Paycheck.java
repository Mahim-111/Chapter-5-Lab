package Lab_report.Problem22;

public class Paycheck {
    private String name;
    private double hourlyWage;
    private double hoursWorked;

    public Paycheck(String name, double hourlyWage, double hoursWorked) {
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double calculatePay() {
        double regularPay = hourlyWage * Math.min(hoursWorked, 40);
        double overtimePay = (hoursWorked > 40) ? (hoursWorked - 40) * 1.5 * hourlyWage : 0;
        return regularPay + overtimePay;
    }

    public double generatePaycheck() {
        double totalPay = calculatePay();
        return  totalPay;
    }
}


