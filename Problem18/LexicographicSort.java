package Lab_report.Problem18;

import java.util.Scanner;

public class LexicographicSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three strings: ");
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();

        String smallest = getSmallest(str1, str2, str3);
        String largest = getLargest(str1, str2, str3);

        String middle = str1;
        if (!str1.equals(smallest) && !str1.equals(largest)) {
            middle = str1;
        } else if (!str2.equals(smallest) && !str2.equals(largest)) {
            middle = str2;
        } else {
            middle = str3;
        }

        System.out.println("Sorted strings:");
        System.out.println(smallest);
        System.out.println(middle);
        System.out.println(largest);
    }

    public static String getSmallest(String a, String b, String c) {
        if (a.compareTo(b) <= 0 && a.compareTo(c) <= 0) {
            return a;
        } else if (b.compareTo(a) <= 0 && b.compareTo(c) <= 0) {
            return b;
        } else {
            return c;
        }
    }

    public static String getLargest(String a, String b, String c) {
        if (a.compareTo(b) >= 0 && a.compareTo(c) >= 0) {
            return a;
        } else if (b.compareTo(a) >= 0 && b.compareTo(c) >= 0) {
            return b;
        } else {
            return c;
        }
    }
}

