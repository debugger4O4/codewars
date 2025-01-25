// https://www.codewars.com/kata/582c297e56373f0426000098/train/java

package kyu_7.convert_a_linked_list_to_a_string.java;

public class Kata {

    public static String stringify(Node list) {
        return list == null ? "null" : list.getData() +  " -> " + stringify(list.getNext());
    }
}
