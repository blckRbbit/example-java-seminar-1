package lesson5;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(isIsomorph("add", "exg"));
    }

    // add - egg
    private static boolean isIsomorph(String a, String b) {
        Map<Character, Character> pairs = new HashMap<>();

        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            char key = a.charAt(i);
            char value = b.charAt(i);

            if (pairs.containsKey(key)) { //containsValue
                if (pairs.get(key) != value) return false;

            } else {
                pairs.put(key, value);
            }
        }
        return true;
    }
}
