package Lab_report.Problem6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        if(number == number1 && number2 == number1)
            System.out.println("all the same");
        else if (number != number1 && number != number2 && number1 != number2)
            System.out.println("all different");
        else
            System.out.println("neither");
    }
}
