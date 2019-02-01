package ru.job4j.taskOfTest;

import java.util.Arrays;

public class TaskOfTest {
    public static void main(String[] args) throws Exception {
        int[] array = {5, 8, 1, 0, 4, 2, 12, 12, 43, 6};
        int[] array2 = {15, 3, 0, 21, 4, 6, 9, 7, 4, 63};

        int[] sortArray = sortArray(array);
        int[] sortArray2 = sortArray(array2);

        int[] resultArray = new int[sortArray.length];
        for (int i = 0; i < sortArray.length; i++) {
            if (sortArray[i] > sortArray2[i]) {
                resultArray[i] = sortArray[i];
            } else resultArray[i] = sortArray2[i];
        }
        showArray(resultArray);
    }

    public static int[] sortArray(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public static void showArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }

}
