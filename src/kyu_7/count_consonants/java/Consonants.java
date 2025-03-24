// https://www.codewars.com/kata/564e7fc20f0b53eb02000106/train/java

package kyu_7.count_consonants.java;

public class Consonants {
    public static int getCount(String str) {
        String lowerCase = str.toLowerCase();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int result = 0;
        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (Character.isLetter(c)) {
                boolean isVowel = false;
                for (char vowel : vowels) {
                    if (c == vowel) {
                        isVowel = true;
                        break;
                    }
                }
                if (!isVowel) {
                    result++;
                }
            }
        }
        return result;
    }
}
