package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
 Вывести название каждой планеты и количество его повторений в списке.
 */
public class Planets {
    static List<String> planets = new ArrayList<>();

    public static void main(String[] args) {
        init();
        System.out.println(getPlanetsWithCount());

        Integer[] s = new Integer[] {1,4,5,6,7,9};
//        List<Integer> list = Arrays.asList(s);
        ArrayList<Integer> ints = (ArrayList<Integer>) Arrays.asList(s);

    }

    private static void init() {
        planets.add("Earth");
        planets.add("Mars"); // 01
        planets.add("Earth");
        planets.add("Pluto");
        planets.add("Earth");
        planets.add("Pluto");
    }


    private static List<String> getPlanetsWithCount() {
        List<String> temp = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        
        for (String planet: planets) {

            if (!temp.contains(planet)) {
                temp.add(planet);
                int count = 0;

                for (String currentPlanet : planets) {
                    if (currentPlanet.equals(planet)) count++;
                }
                builder.append(planet).append(": ").append(count).append(",");
                // Earth: 3, Mars: 1, Pluto: 3,
            }
        }
            // String[] = {"Earth: 3", "Mars: 1", "Pluto: 3"}
        return Arrays.asList(builder.toString().split(","));
    }
}
