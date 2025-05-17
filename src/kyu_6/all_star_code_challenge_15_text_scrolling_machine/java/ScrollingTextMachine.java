// https://www.codewars.com/kata/586560a639c5ab3a260000f3/train/java

package kyu_6.all_star_code_challenge_15_text_scrolling_machine.java;

public class ScrollingTextMachine {
    public String[] rotate(String text) {
        String[] arr = new String[text.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = text.substring(i + 1) + text.substring(0, (i + 1));
        }
        return arr;
    }
}
