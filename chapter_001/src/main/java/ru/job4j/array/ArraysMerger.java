package ru.job4j.array;

import java.util.Arrays;

public class ArraysMerger {
    public int[] arraysMerger(int[] array1, int[] array2) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[array1.length + array2.length];

        while (i < array1.length && j < array2.length) {
            result[k++] = array1[i] < array2[j] ? array1[i++] : array2[j++];
        }
        if (i < array1.length) {
            System.arraycopy(array1, i, result, k, array1.length - i);
        } else if (j < array2.length) {
            System.arraycopy(array2, j, result, k, array2.length - j);
        }
        return result;
    }
}
