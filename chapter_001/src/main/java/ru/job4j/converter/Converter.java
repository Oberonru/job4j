package ru.job4j.converter;

public class Converter {
/**
 * Корвертор валюты.
 */

    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Конвертируем обратно в евро
     *
     * @param eur евро
     * @return евро
     */
    public int euroToRuble(int eur) {
        return eur * 70;
    }

    /**
     * Конвертируем обратно в рубли
     *
     * @param usd доллары
     * @return рубли
     */

    public int dollarToRuble(int usd) {
        return usd * 60;
    }


}
