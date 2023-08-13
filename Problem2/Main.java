package Lab_report.Problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float number = in.nextFloat();
        if(number>0.0)
            System.out.println("Positive");
        else if (number == 0.0)
            System.out.println("Zero");
        else
            System.out.println("Negative");

        if(Math.abs(number)<1)
            System.out.println("Small");
        if(Math.abs(number)>1000000)
            System.out.println("Large");
    }

}
