//package kyu_7.ordered_count_of_characters.java;
//
//
//import java.util.List;
//import java.util.ArrayList;
//import kyu_4.bagels.kotlin.org.apache.commons.lang3.tuple.Pair;
//
//public class Solution {
//    public static List<Pair<Character, Integer>> orderedCount(String text) {
//        List<Pair<Character, Integer>> result = new ArrayList<>();
//
//        int length = text.length();
//        while(text.length() > 0) {
//            Character key = text.charAt(0);
//            text = text.replaceAll(String.valueOf(key), "");
//            result.add(Pair.of(key, length - text.length()));
//            length = text.length();
//        }
//
//        return result;
//    }
//}