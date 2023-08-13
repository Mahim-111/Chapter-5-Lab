package Lab_report.Problem16;

import java.util.Scanner;

public class CardDescription {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the card notation: ");
        String notation = scanner.next().toUpperCase();

        Card card = new Card(notation);
        String description = card.getDescription();

        System.out.println(description);
    }
}
