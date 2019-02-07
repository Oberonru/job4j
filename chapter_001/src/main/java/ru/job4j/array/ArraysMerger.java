package ru.job4j.array;

import java.util.Arrays;

public class ArraysMerger {
    public int[] arraysMerger(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, newArray, 0, array1.length);
        System.arraycopy(array2, 0, newArray, array1.length, array2.length);
        Arrays.sort(newArray);
        return newArray;
    }

}
