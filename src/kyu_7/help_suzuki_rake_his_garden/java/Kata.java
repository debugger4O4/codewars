// https://www.codewars.com/kata/571c1e847beb0a8f8900153d/train/java

package kyu_7.help_suzuki_rake_his_garden.java;

public class Kata {
    public static String rakeGarden(String garden) {
        String[] strings = garden.split(" ");
        StringBuilder result = new StringBuilder();
        for (String string : strings) {
            if (!(string.equals("gravel") || string.equals("rock"))) {
                result.append("gravel").append(" ");
            } else {
                result.append(string).append(" ");
            }
        }
        return result.toString().trim();
    }
}