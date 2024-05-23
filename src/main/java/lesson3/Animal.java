package lesson3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Animal {
    String bread;
    String name;
    int age;

    public Animal(String bread, String n) {
        this.bread = bread;
        name = n;
        age = 1;


    }

    @Override
    public String toString() {
        return "Animal{" +
                "bread='" + bread + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
