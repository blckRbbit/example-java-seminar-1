package lesson2;

import java.io.*;

public class Lesson2 {

    public static void main(String[] args) {
        String JSON = " {\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String s = "select * from students where ";

        StringBuilder sb = new StringBuilder(s);

        String name = JSON.replace("{", "")
                .replace("[", "")
                .replace("\"", "")
                .split(",")[0]
                .split(":")[1];

        System.out.println(name);
        sb.append("name = " ).append(name).append(name);

        Double l = 122D;
        //.....

        try {
            FileReader fr = new FileReader("1.txt");
            System.out.println("Прочитали");
//            int x = 2 / 0;
        }
        catch (ArithmeticException e) {
            try {
                FileWriter writer = new FileWriter("error.txt", true);
                writer.write("Мы здесь, потому что была ошибка ArithmeticException \n");
                writer.flush();
            } catch (IOException ex) {
                System.out.println("2 catch");
            }
        }
        catch (FileNotFoundException e) {
            try {
                FileWriter writer = new FileWriter("error.txt", true);
                writer.write("Мы здесь, потому что была ошибка FileNotFoundException \n");
                writer.flush();
            } catch (IOException ex) {
                System.out.println("2 catch");
            }
        }

    }


    private static void foo(String[] arr) {
        Double count = 0D;
//        FileReader reader = null;
        try {
//            reader = new FileReader("djagrkj");
            for (String elem : arr) {
                count += Double.parseDouble(elem); //"1d"
            }
        }
        catch (NumberFormatException e) {
//            count =null;
//            System.out.println("Error");
            e.printStackTrace();
        }
//        catch (IOException e) {
//            count =null;
//            System.out.println("File not found");
//        }
        finally {
            try {
//                reader.close();
            } catch (Exception e) {}

            System.out.println("Я файналли");
        }


        System.out.println(count);
    }


}
