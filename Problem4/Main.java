package Lab_report.Problem4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        if (str.charAt(0) == str.charAt(str.length() - 1))
            System.out.println("first and last letter same");
        else
            System.out.println("first and last letter different");
    }
}


