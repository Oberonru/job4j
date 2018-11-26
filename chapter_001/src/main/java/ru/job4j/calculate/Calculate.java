package ru.job4j.calculate;

    /**
     * class Calculator
     *
     * @autor Alexey Petrushenko
     * @since 21.11.2018.
     */
public class Calculate {
    /**
     * Main.
     *
     * @param args - args.
     */

    private double result = 0.0;

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    /**
     * Method echo.
     *
     * @param name Your name.
     * @return Echo plus your name.
     */
    public String echo(String name) {
        return "Echo, echo, echo : " + name;
    }

    public void add(double first, double second) {
        this.result = first + second;
    }

    public void substract(double first, double second) {
        this.result = first - second;
    }

    public void div(double first, double second) {
        this.result = first / second;
    }

    public void multiple(double first, double second) {
        this.result = first * second;
    }

    public double getResult() {
        return this.result;
    }

}