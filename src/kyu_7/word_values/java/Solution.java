// https://www.codewars.com/kata/598d91785d4ce3ec4f000018/train/java

package kyu_7.word_values.java;

class Solution{

    private final static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static int [] nameValue(String [] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String[] strings = arr[i].split(" ");
            if (strings.length == 1) {
                result[i] = getSum(arr[i].toCharArray()) * (i + 1);
            } else {
                result[i] = getSum(strings) * (i + 1);
            }
        }
        return result;
    }

    public static int getSum(char[] chars) {
        int result = 0;
        for (char c : chars) {
            result += alphabet.indexOf(c);
        }
        return result + chars.length;
    }

    public static int getSum(String[] strings) {
        int result = 0;
        for (String s : strings) {
            for (char c : s.toCharArray()) {
                result += alphabet.indexOf(c);
            }
            result += s.length();
        }
        return result;
    }
}
