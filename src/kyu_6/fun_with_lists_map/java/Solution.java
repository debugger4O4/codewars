// https://www.codewars.com/kata/58259d9062cfb45e1a00006b/train/java

package kyu_6.fun_with_lists_map.java;

import java.util.Optional;
import java.util.function.Function;

class Solution {
    static <T, R> Node<R> map(Node<T> head, Function<T, R> f) {
        if (head == null) {
            return null;
        }
        return Optional.of(head).map(m -> {
            return new Node<>(f.apply(m.data), map(m.next, f));
        }).orElse(null);
    }
}
