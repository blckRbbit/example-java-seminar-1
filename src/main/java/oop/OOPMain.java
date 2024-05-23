package oop;

import java.util.Arrays;
import java.util.List;

public class OOPMain {

    public static void main(String[] args) {
        int[] array = new int[]{2, 55, - 3, 15, 0 , -555, 333,55, -123, 0, 0, 9};
        IntegerArray arr = new IntegerArray(array);

        System.out.println(Arrays.toString(arr.sort()));
    }


}
