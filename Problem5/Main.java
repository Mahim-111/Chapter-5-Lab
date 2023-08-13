package Lab_report.Problem5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String strOfFastHalf = str.substring(0,str.length()/2);
        String strOfSecondHalf;
        if(str.length() % 2 == 0)
            strOfSecondHalf = str.substring(str.length()/2 ,str.length());
        else
            strOfSecondHalf = str.substring(str.length()/2 +1 ,str.length());
        System.out.println(strOfFastHalf);
        System.out.println(strOfSecondHalf);
        for(int i = 0; i<strOfSecondHalf.length(); i++){
            if (strOfFastHalf.charAt(i) != strOfSecondHalf.charAt(i)){
                System.out.println("first and second half different");
                return;
            }
        }
        System.out.println("first and second half same");


    }
}
