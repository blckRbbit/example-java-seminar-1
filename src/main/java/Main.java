import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        String s1 = "hello";
//        String s2 = "hello";
//
//        String s3 = s1;
//        String s4 = "h" + "e" + "l" + "l" + "o"; //"hello"
//        String s5 = new String("hello");
//        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
//
//        isEqual(s1, s6);

        ArrayList strings = new ArrayList<String>();

        strings.add("lavjhgoe");
        strings.add(1);
        strings.add(22);
        strings.add(22);
        strings.add(22);
        strings.add("hello");
        strings.add(22.3);

        System.out.println(strings);

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i) instanceof Number) {
                strings.remove(i--);
//                i--; // костыль которого не избежать
            }
        }

        System.out.println(strings);
        List<List<String>> l = new ArrayList<>();
    }



    public static void isEqual(String arg0, String arg1) {
//        s1 = s1 + "ldfjghoaergb";
        if (arg0 == arg1) {
//            "a" == "a"; //false
            System.out.println("Равны как ссылки");
        } else if (arg0 != arg1) {
            System.out.println("Не равны как ссылки");
        }
        if (arg0.equals(arg1)) {
            System.out.println("Равны как значения");
        } else if (!arg0.equals(arg1)) {
            System.out.println("Не равны как значения");
        }
    }
}
