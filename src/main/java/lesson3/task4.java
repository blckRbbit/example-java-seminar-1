package lesson3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class task4 {
//    Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
//    что на 0-й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
//    Напишите метод для заполнения данной структуры.

    public static void main(String[] args) {
        List<ArrayList<String>> books = new ArrayList<>();
        ArrayList<String> proza = new ArrayList<>(List.of("proza", "Война и мир", "Буратино"));
        ArrayList<String> poezia = new ArrayList<>(List.of("poezia", "Евгений Онегин", "Буратино"));
    }

}
