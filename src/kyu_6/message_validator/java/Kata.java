// https://www.codewars.com/kata/5fc7d2d2682ff3000e1a3fbc/train/java

package kyu_6.message_validator.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {

    public static boolean isAValidMessage(String message) {
        if (message.isEmpty()) {
            return true;
        }
        if (!Character.isDigit(message.charAt(0))) {
            return false;
        }
        Pattern pattern = Pattern.compile("([0-9]+)([a-zA-Z]+|$)");
        Matcher matcher = pattern.matcher(message);
        while(matcher.find()) {
            String num = matcher.group(1);
            String letter = matcher.group(2);
            int length = Integer.parseInt(num);
            if(letter.length() != length){
                return false;
            }
        }
        return true;
    }
}
