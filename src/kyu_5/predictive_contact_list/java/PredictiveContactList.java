// https://www.codewars.com/kata/56d48fe6df521074e0001140/train/java

package kyu_5.predictive_contact_list.java;

import java.util.*;

public class PredictiveContactList {

    private static final Map<Integer, String> keyboard = new HashMap<>();

    static {
        keyboard.put(2, "abc");
        keyboard.put(3, "def");
        keyboard.put(4, "ghi");
        keyboard.put(5, "jkl");
        keyboard.put(6, "mno");
        keyboard.put(7, "pqrs");
        keyboard.put(8, "tuv");
        keyboard.put(9, "wxyz");
    }

    public static List<String> predict(List<String> contacts, String keystrokes) {
        List<String> result = new ArrayList<>();
        contacts.forEach(contact -> {
            if (contact.length() >= keystrokes.length()) {
                for (int i = 0; i < contact.length(); i++) {
                    if (i < keystrokes.length()) {
                        int key = Integer.parseInt(keystrokes.charAt(i) + "");
                        if (!keyboard.get(key).contains(contact.toLowerCase().charAt(i) + "")) {
                            return;
                        }
                    }
                }
                result.add(contact);
            }
        });
        return result;
    }
}
