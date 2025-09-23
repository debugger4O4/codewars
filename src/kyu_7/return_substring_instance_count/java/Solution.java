// https://www.codewars.com/kata/5168b125faced29f66000005/train/java

package kyu_7.return_substring_instance_count.java;

public class Solution {
    public static int substringCount(String fullText, String search) {
        int count = 0;
        int startIndex = 0;
        while ((startIndex = fullText.indexOf(search, startIndex)) != -1) {
            count++;
            startIndex += search.length();
        }
        return count;
    }
}