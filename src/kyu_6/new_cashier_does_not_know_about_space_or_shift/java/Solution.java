package kyu_6.new_cashier_does_not_know_about_space_or_shift.java;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    private static final List<String> sort = new ArrayList<>(
            List.of("burger", "fries", "chicken", "pizza", "sandwich", "onionrings", "milkshake", "coke")
    );

    public static String getOrder(String input) {
        Pattern pattern = Pattern.compile("burger|fries|chicken|pizza|sandwich|onionrings|milkshake|coke");
        Matcher matcher = pattern.matcher(input);
        List<String> result = new ArrayList<>();
        while (matcher.find()) {
            if (matcher.group() != null) {
                result.add(matcher.group());
            }
        }
        result.sort((a, b) -> {
            int indexA = sort.indexOf(a);
            int indexB = sort.indexOf(b);
            return indexA - indexB;
        });
        result = result.stream().map(t -> t.substring(0, 1).toUpperCase() + t.substring(1)).toList();
        return String.join(" ", result);
    }

}
