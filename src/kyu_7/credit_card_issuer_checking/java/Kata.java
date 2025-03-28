// https://www.codewars.com/kata/5701e43f86306a615c001868/train/java

package kyu_7.credit_card_issuer_checking.java;

public class Kata {
    public static String getIssuer(String cardNumber) {
        return (cardNumber.startsWith("34") || cardNumber.startsWith("37")) && cardNumber.length() == 15 ? "AMEX" :
               cardNumber.startsWith("6011") && cardNumber.length() == 16 ? "Discover" :
               (cardNumber.startsWith("51")
                       || cardNumber.startsWith("52")
                       || cardNumber.startsWith("53")
                       || cardNumber.startsWith("54")
                       || cardNumber.startsWith("55")) && cardNumber.length() == 16 ? "Mastercard" :
               cardNumber.startsWith("4") && (cardNumber.length() == 13 || cardNumber.length() == 16) ? "VISA" : "Unknown";
    }
}
