package kyu_6.fun_with_lists_map.java;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import java.util.function.*;

public class SolutionTest {

    @Test
    public void basicTests() {
        testMap(null, __ -> false, null);

        Function<Integer, Integer> f = x -> x * 2;
        testMap(
                new Node<Integer>(1,
                        new Node<Integer>(2,
                                new Node<Integer>(3)
                        )
                ), f,
                new Node<Integer>(2,
                        new Node<Integer>(4,
                                new Node<Integer>(6)
                        )
                )
        );
    }

    private static <T, R> void testMap(Node<T> head, Function<T, R> f, Node<R> expected) {
        assertArrayEquals(listToArray(expected), listToArray(Solution.map(head, f)));
    }

    private static Node<Integer> arrayToList(int[] array) {
        return array.length == 0 ? null : new Node<Integer>(array[0], arrayToList(Arrays.copyOfRange(array, 1, array.length)));
    }

    private static <T> Object[] listToArray(Node<T> head) {
        Collection<T> values = new LinkedList<T>();
        for (; head != null; head = head.next) values.add(head.data);
        return values.toArray();
    }
}
