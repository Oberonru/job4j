package ru.job4j.converter;

public class Converter {
/**
 * Корвертор валюты.
 */


    /**
     * Ваша задача.
     * 1. Реализовать метод конвертации рублей в евро и доллары. Добавить формулу вычисления.
     * На текущий момент соотношение валют.
     *
     * То есть, Вам нужно вместo -1 подставить формулу для вычисления валюты.
     *
     * 1 доллар = 60 рублей.
     * 1 евро = 70 рублей.
     *
     * 2. Добавь еще два методы для обратно конвертации евро и долларов в рубли.
     *
     * 3. Воспользуйтесь тестом.
     */

    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value/70;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value/60;
    }

    /**
     * Конвертируем обратно в евро
     *
     * @param EUR евро
     * @return евро
     */
    public int euroToRuble(int EUR) {
        return EUR*70;
    }

    /**
     *
     * Конвертируем обратно в рубли
     * @param USD  доллары
     * @return рубли
     */

    public int dollarToRuble(int USD) {
        return USD*60;
    }


}
