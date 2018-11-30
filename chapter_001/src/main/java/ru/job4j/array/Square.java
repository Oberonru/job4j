package ru.job4j.array;

public class Square {

    public int[] calculate(int bound) {
        int[] rst = {1, 2, 3};
        for (int i = 0; i < bound; i++) {
            rst[i] = (int) Math.pow(rst[i], 2);
        }
        return rst;
    }
}
