package lesson1;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Lesson1 {


    public static void main(String [] args) {

        try {
            int[] arr = new int[3];
            arr[1] = 11;
            int i =  1/0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        finally {
            System.out.println("Finally");
        }

    }
}
