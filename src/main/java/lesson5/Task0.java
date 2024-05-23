package lesson5;

import java.util.*;

public class Task0 {

    public static void main(String[] args) {
        Map<Integer, String> passNumToName = new TreeMap<>();

        passNumToName.put(123456, "Ivanov");
        passNumToName.put(321456, "Vasilyev");
        passNumToName.put(234561, "Petrova");
        passNumToName.put(234432, "Ivanov");
        passNumToName.put(654321, "Petrova");
        passNumToName.put(345678, "Ivanov");

        Map<String, ArrayList<Integer> > map = new HashMap<>();

//        get - по ключу получить значение
//                size - длина энтри сета;
//        put - добавить к и з в мап

//        if map.get(name) != null -> List map.get(name) -> list.add(num);
//        else -> map.put(name, new ArrayList<>()) -> map.get(name) -> list.add(num)
//


//        Map<Integer, String> map = Map.of(123456, "Ivanov", 321456, "Vasilyev");
//        map.remove(123456);
        System.out.println(passNumToName);

        for (Map.Entry<Integer, String> entry : passNumToName.entrySet()) {
            if (entry.getValue().equals("Ivanov"))
                System.out.println(entry);
        }

//        List<Map.Entry<Integer, String>> ivanovs = passNumToName.entrySet()
//                .stream()
//                .filter(integerStringEntry -> integerStringEntry.getValue().equals("Ivanov"))
//                .toList();

//        System.out.println(ivanovs);

//        map.put(123456, "etwa");

    }


}
