package lesson3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson3 {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        l.addAll(List.of(1,1,1,4));


        System.out.println(l);
        System.out.println(l.get(2));

        l.remove(2);

    }
}
