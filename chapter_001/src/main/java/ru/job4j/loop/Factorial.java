package ru.job4j.loop;

public class Factorial {

    public int calc(int n) {
        if (n <= 0) {
            return 1;
        }
        return calc(n - 1) * n;
    }
}
