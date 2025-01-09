package kyu_7.formatting_decimal_places_1.java;

public class Numbers {
    public static double twoDecimalPlaces(double number) {
        String[] digits = String.valueOf(number).split("\\.");
        String result = digits[0] + "." + digits[1].substring(0, 2);
        return Double.parseDouble(result);
    }
}
