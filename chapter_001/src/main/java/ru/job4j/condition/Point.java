package ru.job4j.condition;

public class Point {
    /**
     * @author Alexey Petrushenko
     * @version 1.1.
     * @since 26.11.2018
     */

    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }
}
