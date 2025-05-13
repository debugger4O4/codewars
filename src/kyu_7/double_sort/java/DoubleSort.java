// https://www.codewars.com/kata/57cc79ec484cf991c900018d/train/java

package kyu_7.double_sort.java;

import java.util.Arrays;

public class DoubleSort {
    public static Object[] dbSort(Object[] a){
        Integer[] nums = Arrays.stream(a).filter(f -> f.getClass().getSimpleName().equals("Integer")).toArray(Integer[]::new);
        String[] strings = Arrays.stream(a).filter(f -> f.getClass().getSimpleName().equals("String")).toArray(String[]::new);
        Object[] result = new Object[strings.length + nums.length];
        Arrays.sort(nums);
        Arrays.sort(strings);
        System.arraycopy(nums, 0, result, 0, nums.length);
        for (int i = nums.length, j = 0; j < strings.length; i++, j++) {
            result[i] = strings[j];
        }
        return result;
    }
}
