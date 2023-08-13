package Lab_report.Problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        number = Math.abs(number);
        int countDigit = 0;
        while (number>0){
            countDigit++;
            number = number / 10;
        }
        System.out.println(countDigit);
    }
}


