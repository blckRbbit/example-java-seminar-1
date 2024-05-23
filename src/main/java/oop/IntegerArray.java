package oop;

import java.util.Arrays;

public class IntegerArray {
    private int[] array;

    public IntegerArray(int[] array) {
        this.array = array;
    }

    public int[] sort() {
        return sort(array);
    }

    private int[] sort(int[] result) {
        int mid = result.length / 2;

        if (result.length <= 1) return result;

        int[] left = Arrays.copyOfRange(result, 0, mid);
        int[] right = Arrays.copyOfRange(result, left.length, result.length);

        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int length = left.length + right.length;
        int[] result = new int[length];

        int leftIndex = 0, rightIndex = 0, resultIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] > right[rightIndex]) {
                result[resultIndex++] = right[rightIndex++];
            } else {
                result[resultIndex++] = left[leftIndex++];
            }
        }

        while (resultIndex < result.length) {
            if (leftIndex != left.length) {
                result[resultIndex++] = left[leftIndex++];
            }

            if (rightIndex != right.length) {
                result[resultIndex++] = right[rightIndex++];
            }
        }

        return result;
    }
}
