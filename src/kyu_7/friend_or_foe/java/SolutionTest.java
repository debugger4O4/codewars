package kyu_7.friend_or_foe.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

class SolutionTest {

    @Test
    void testFriend() {
        assertEquals(List.of("Ryan", "Yous"), Kata.friend(List.of("Ryan", "Kieran", "Jason", "Yous")), "Input: [\"Ryan\", \"Kieran\", \"Jason\", \"Yous\"]");
        assertEquals(List.of(), Kata.friend(List.of("Peter", "Stephen", "Joe")), "Input: [\"Peter\", \"Stephen\", \"Joe\"]");
    }
}
