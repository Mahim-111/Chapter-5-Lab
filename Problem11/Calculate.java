package Lab_report.Problem11;

public class Calculate {
    public static String calculateDirection(int angle) {
        if (angle >= 337.5 || angle < 22.5) {
            return "N";
        } else if (angle >= 22.5 && angle < 67.5) {
            return "NE";
        } else if (angle >= 67.5 && angle < 112.5) {
            return "E";
        } else if (angle >= 112.5 && angle < 157.5) {
            return "SE";
        } else if (angle >= 157.5 && angle < 202.5) {
            return "S";
        } else if (angle >= 202.5 && angle < 247.5) {
            return "SW";
        } else if (angle >= 247.5 && angle < 292.5) {
            return "W";
        } else {
            return "NW";
        }
    }
}
