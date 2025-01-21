// https://www.codewars.com/kata/5a07e5b7ffe75fd049000051/train/java

package kyu_8.sort_my_textbooks.java;

import java.util.*;

class sorter {

    public static List<String> sort(List<String> textbooks) {
        textbooks.sort(String::compareToIgnoreCase);
        return textbooks;
    }
}
