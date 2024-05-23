import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class EX2 {
    public static void main(String[] args) {
        printCollection(List.of(1,2));
    }
    private static <E> void printCollection(Collection<E> c) {
//        Iterator<?> i = c.iterator();
        for (int j = 0; j < c.size() ; j++) {
            System.out.print(c);
        }
    }
}
