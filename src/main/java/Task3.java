import java.io.*;
import java.time.LocalTime;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {
//        run();
        File file = new File("example.txt");
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String line;
        String expression = "";

        while ((line = br.readLine()) != null) {
            expression = line;
        }

        System.out.println(expression);
    }

    // https://github.com/blckRbbit/example-java-seminar-1/tree/master/src/main/java

    private static void run() {
        LocalTime now = LocalTime.now();

        System.out.println("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String mask = "%s!%n";
        String hello = "";

        if(now.isAfter(LocalTime.of(5, 0)) && now.isBefore(LocalTime.of(12, 0))) {
            hello = "Доброе утро, ";
        } else if(now.isAfter(LocalTime.of(12, 0)) && now.isBefore(LocalTime.of(18, 0))) {
            hello = "Добрый день, ";
        } else if (now.isAfter(LocalTime.of(18, 0)) && now.isBefore(LocalTime.of(23, 0))) {
            hello = "Добрый вечер, ";
        } else {
            hello = "Доброй ночи, ";
        }

        System.out.printf(mask, hello + name);
    }

    private static void run1() {
        LocalTime now = LocalTime.now();

        System.out.println("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int hour = now.getHour();

        if (hour > 5 &&  hour < 12) {

        }
    }
}
