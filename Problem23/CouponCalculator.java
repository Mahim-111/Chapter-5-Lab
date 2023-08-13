package Lab_report.Problem23;

import java.util.Scanner;

public class CouponCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the cost of your groceries: ");
        double amountSpent = scanner.nextDouble();

        double couponPercentage = 0;
        double couponValue = 0;

        if (amountSpent >= 10 && amountSpent <= 60) {
            couponPercentage = 0.08;
        } else if (amountSpent > 60 && amountSpent <= 150) {
            couponPercentage = 0.1;
        } else if (amountSpent > 150 && amountSpent <= 210) {
            couponPercentage = 0.12;
        } else if (amountSpent > 210) {
            couponPercentage = 0.14;
        }

        couponValue = amountSpent * couponPercentage;

        System.out.printf("You win a discount coupon of $ %.2f. (%.0f%% of your purchase)%n", couponValue, couponPercentage * 100);
    }
}

