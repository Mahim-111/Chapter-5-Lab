package Lab_report.Problem20;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        String input = scanner.nextLine();

        if (input.length() != 1) {
            System.out.println("Error: Please enter a single character.");
        }
        else {
            char ch = input.charAt(0);
            if (Character.isLetter(ch)) {
                ch = Character.toUpperCase(ch);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            } else {
                System.out.println("Error: Please enter a valid letter.");
            }
        }
    }
}

