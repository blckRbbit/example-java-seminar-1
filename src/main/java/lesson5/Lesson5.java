package lesson5;

import java.util.*;

public class Lesson5 {
    static Map<String, ArrayList<Integer>> map = new HashMap<>();
    public static void main(String[] args) {


        map.put("Саша", new ArrayList<>());



    }

    private static void addNum(String key, Integer phone) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(phone);
        Collections.sort(map.get(key));
    }
}
