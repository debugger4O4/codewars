// https://www.codewars.com/kata/5a5032f4fd56cb958e00007a/train/java

package kyu_7.tv_remote.java;

import java.util.HashMap;
import java.util.Map;

public class Dinglemouse {

    private record Position(int x, int y) {

        public int manhattanDistance(Position other) {
                return Math.abs(x - other.x) + Math.abs(y - other.y);
            }
        }

    private static final Map<Character, Position> TV_KEYBOARD_MAP = initializeKeyboard();

    private static Map<Character, Position> initializeKeyboard() {
        Map<Character, Position> keyboardMapping = new HashMap<>();
        keyboardMapping.put('a', new Position(1, 1));
        keyboardMapping.put('b', new Position(2, 1));
        keyboardMapping.put('c', new Position(3, 1));
        keyboardMapping.put('d', new Position(4, 1));
        keyboardMapping.put('e', new Position(5, 1));
        keyboardMapping.put('1', new Position(6, 1));
        keyboardMapping.put('2', new Position(7, 1));
        keyboardMapping.put('3', new Position(8, 1));
        keyboardMapping.put('f', new Position(1, 2));
        keyboardMapping.put('g', new Position(2, 2));
        keyboardMapping.put('h', new Position(3, 2));
        keyboardMapping.put('i', new Position(4, 2));
        keyboardMapping.put('j', new Position(5, 2));
        keyboardMapping.put('4', new Position(6, 2));
        keyboardMapping.put('5', new Position(7, 2));
        keyboardMapping.put('6', new Position(8, 2));
        keyboardMapping.put('k', new Position(1, 3));
        keyboardMapping.put('l', new Position(2, 3));
        keyboardMapping.put('m', new Position(3, 3));
        keyboardMapping.put('n', new Position(4, 3));
        keyboardMapping.put('o', new Position(5, 3));
        keyboardMapping.put('7', new Position(6, 3));
        keyboardMapping.put('8', new Position(7, 3));
        keyboardMapping.put('9', new Position(8, 3));
        keyboardMapping.put('p', new Position(1, 4));
        keyboardMapping.put('q', new Position(2, 4));
        keyboardMapping.put('r', new Position(3, 4));
        keyboardMapping.put('s', new Position(4, 4));
        keyboardMapping.put('t', new Position(5, 4));
        keyboardMapping.put('.', new Position(6, 4));
        keyboardMapping.put('@', new Position(7, 4));
        keyboardMapping.put('0', new Position(8, 4));
        keyboardMapping.put('u', new Position(1, 5));
        keyboardMapping.put('v', new Position(2, 5));
        keyboardMapping.put('w', new Position(3, 5));
        keyboardMapping.put('x', new Position(4, 5));
        keyboardMapping.put('y', new Position(5, 5));
        keyboardMapping.put('z', new Position(6, 5));
        keyboardMapping.put('_', new Position(7, 5));
        keyboardMapping.put('/', new Position(8, 5));
        return keyboardMapping;
    }

    public static int tvRemote(String word) {
        word = "a" + word;
        int result = 0;
        for(int i = 0; i < word.length() - 1; i++) {
            Position currentMapping = TV_KEYBOARD_MAP.get(word.charAt(i));
            Position nextMapping = TV_KEYBOARD_MAP.get(word.charAt(i + 1));
            result += currentMapping.manhattanDistance(nextMapping) + 1;
        }
        return result;
    }
}
