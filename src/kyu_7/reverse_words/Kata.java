package kyu_7.reverse_words;

//import kyu_4.bagels.kotlin.org.junit.platform.commons.util.StringUtils;

// Переворачивает каждое слово в предложении

public class Kata {
    public static String reverseWords(final String original) {
//        if (original.length() == 0 || StringUtils.isBlank(original)) {
//            return original;
//        }
        String[] words = original.split(" ");
        StringBuilder result = new StringBuilder();
        for (String s : words) {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            result.append(sb.append(" "));
            if (s.equals(" ")) {

            }
        }
        return result.toString().trim();
    }
}
