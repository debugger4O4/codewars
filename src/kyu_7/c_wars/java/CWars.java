// https://www.codewars.com/kata/55968ab32cf633c3f8000008/train/java

package kyu_7.c_wars.java;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

class CWars {

    public static String initials(String name){
        return stream(name.split(" ")).map(s -> s.substring(0, 1).toUpperCase()).collect(joining("."))
                + name.substring(name.lastIndexOf(' ') + 2);
    }

}
