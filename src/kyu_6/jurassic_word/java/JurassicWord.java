// https://www.codewars.com/kata/55709dc15ebd283cc9000007/train/java

package kyu_6.jurassic_word.java;

import static java.util.Map.of;

public class JurassicWord {

    public static String lunchTime(String scene) {
        var dino = of("A T-Rex", "(...?)VvvvV(...)", "A brachiosaurus", "(...?)uuuuu(...)", "A velociraptor", "(...?)vvvvv(...)", "A triceratops", "(...?)uuVuu(...)");
        var d = dino.keySet().stream().filter(s -> scene.matches(dino.get(s))).findFirst().orElse("Something");

        var food = of("a dead dino", "_C.....C}>", "flowers", "iii.....iii", "leaves", "\\|\\|\\|.....\\|\\|\\|");
        var f = food.keySet().stream().filter(s -> scene.matches(food.get(s))).findFirst().orElse("something");

        if (d.matches(".*T.*|.*v.*") && f.matches(".*v.*|.*fl.*") || d.matches(".*br.*|.*tr.*") && f.matches(".*dead.*") || d.matches(".*tr.*") && f.matches(".*v.*")) {
            d = "Something";
        }
        return d + " is eating " + f + ".";
    }
}
