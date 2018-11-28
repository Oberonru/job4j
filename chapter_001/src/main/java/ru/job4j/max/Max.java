package ru.job4j.max;

public class Max {

    /**
     * @author Alexey Petrushenko
     * @version 1.1
     * @scince 26.11.2018
     */
    public int max(int first, int second) {
        return first >= second ? first : second;
    }

    public int max(int first, int second, int third) {
        int tempt = max(first, second);
        return max(tempt, third);
    }
}
