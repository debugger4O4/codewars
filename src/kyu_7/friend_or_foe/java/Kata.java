package kyu_7.friend_or_foe.java;

import java.util.List;

class Kata {
    public static List<String> friend(List<String> x){
        return x.stream().filter(f -> f.length() == 4).toList();
    }
}
