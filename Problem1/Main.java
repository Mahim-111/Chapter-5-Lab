package Lab_report.Problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(number>0)
            System.out.println("Positive");
        else if (number == 0)
            System.out.println("Zero");
        else
            System.out.println("Negative");
    }
}
