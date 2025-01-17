// https://www.codewars.com/kata/55f1b763dd670651620000ce/train/java

package kyu_8.counting_characters.java;

interface Count {
    static int countCharOccurrences(String s, char c) {
        return s.replaceAll("[^" + c + "]", "").length();
    }
}
