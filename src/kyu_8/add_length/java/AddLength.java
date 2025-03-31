// https://www.codewars.com/kata/559d2284b5bb6799e9000047/train/java

package kyu_8.add_length.java;

import java.util.Arrays;

public class AddLength{

    public static String[] addLength(String str){
        return Arrays.stream(str.split(" ")).map(m -> m + " " + m.length()).toList().toArray(new String[0]);
    }
}
