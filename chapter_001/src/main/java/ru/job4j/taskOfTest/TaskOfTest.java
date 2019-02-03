package ru.job4j.taskOfTest;

import java.util.Arrays;

public class TaskOfTest {
    public void resultSort(int[] array, int[] array2) {
        int[] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array2[i]){
                resultArray[i] = array[i];
            }
            else resultArray[i] = array2[i];
        }
    }


}
