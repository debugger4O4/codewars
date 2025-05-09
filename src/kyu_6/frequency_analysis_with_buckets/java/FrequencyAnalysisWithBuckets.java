// https://www.codewars.com/kata/5ac95cb05624bac42e000005/train/java

package kyu_6.frequency_analysis_with_buckets.java;

import java.util.*;
import java.util.stream.Collectors;

public class FrequencyAnalysisWithBuckets {
    public static ArrayList<ArrayList<Integer>> bucketize(final int[] arr) {
        Map<Integer, Integer> count = initMap(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i <= arr.length; ++i) {
            result.add(new ArrayList<>());
        }

        count.forEach((key, value) -> result.get(value).add(key));

        return result.stream()
                .map(i -> i.size() > 0 ? i.stream().sorted().collect(Collectors.toCollection(ArrayList::new)) : null)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private static Map<Integer, Integer> initMap(int[] arr) {
        Map<Integer, Integer> digitsCount = new HashMap<>();
        for (int c : arr) {
            digitsCount.put(c, digitsCount.getOrDefault(c, 0) + 1);
        }
        return digitsCount;
    }
}
