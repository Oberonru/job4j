package ru.job4j.array;

import java.util.Arrays;

public class ArraysMerger {
    public int[] arraysMerger(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];
        int i = 0, j = 0;
        for (int k = 0; k < newArray.length; k++) {
            if (i > array1.length - 1) {
                newArray[k] = array2[j];
                i++;
            }
            else if (j > array2.length - 1) {
                newArray[k] = array1[i];
            }
            else if (array1[i] < array2[j]) {
                newArray[k] = array1[i];
                i++;
            }
            else {
                newArray[k] = array2[j];
                j++;
            }
        }
        return newArray;
    }
}
