package ru.job4j.array;

public class Square {

    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (int) Math.pow(rst[i], 2);
        }
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        return rst;
    }
}
