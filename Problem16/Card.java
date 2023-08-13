package Lab_report.Problem16;
class Card {
    private String notation;

    public Card(String notation) {
        this.notation = notation;
    }

    public String getDescription() {
        char valueChar = notation.charAt(0);
        char suitChar = notation.charAt(1);

        String value = "";
        String suit = "";

        switch (valueChar) {
            case 'A':
                value = "Ace";
                break;
            case '2':
                value = "2";
                break;
            case '3':
                value = "3";
                break;
            case '4':
                value = "4";
                break;
            case '5':
                value = "5";
                break;
            case '6':
                value = "6";
                break;
            case '7':
                value = "7";
                break;
            case '8':
                value = "8";
                break;
            case '9':
                value = "9";
                break;
            case '1':
                value = "10";
                break;
            case 'J':
                value = "Jack";
                break;
            case 'Q':
                value = "Queen";
                break;
            case 'K':
                value = "King";
                break;
            default:
                return "Unknown";
        }

        switch (suitChar) {
            case 'D':
                suit = "Diamonds";
                break;
            case 'H':
                suit = "Hearts";
                break;
            case 'S':
                suit = "Spades";
                break;
            case 'C':
                suit = "Clubs";
                break;
            default:
                return "Unknown";
        }

        return value + " of " + suit;
    }
}



