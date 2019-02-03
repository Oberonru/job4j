package ru.job4j.array;

public class SortedArray {

    public void sort(int[] array, int[] array2) {
        int[] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array2[i]) {
                resultArray[i] = array[i];
            } else {
                resultArray[i] = array2[i];
            }
        }
    }
}
