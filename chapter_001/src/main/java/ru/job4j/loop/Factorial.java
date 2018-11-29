package ru.job4j.loop;

public class Factorial {

    public int calc(int n) {
        int result = 0;
        if (n <= 1) {
            return 1;
        }
        for (int i = 0; i <= n; i++) {
            result += n * (n - 1);
        }
        return result;
//        if (n <= 0) {
//            return 1;
//        }
//        return calc(n - 1) * n;
    }
}
