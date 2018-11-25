package ru.job4j.calculate;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 *
 * @autor Alexey Petrushenko
 * version 1.0.0
 * @since 20.11.2018
 */

public class CalculateTest {

    /**
     * Test eho
     */

    @Test
    public void whenTakeNameThenTreeEchoPlusName() {
        String input = "Alexey Petrushenko";
        String expect = "Echo, echo, echo : Alexey Petrushenko";
        Calculate calc = new Calculate();
        String result = calc.echo(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculate calc = new Calculate();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void testSubstract() {
        Calculate calculate = new Calculate();
        calculate.substract(5D, 1D);
        double result = calculate.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }

    @Test
    public void testDiv() {
        Calculate calculate = new Calculate();
        calculate.div(4D, 2D);
        double result = calculate.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void testMultiple() {
        Calculate calculate = new Calculate();
        calculate.multiple(5D, 5D);
        double result = calculate.getResult();
        double expected = 25D;
        assertThat(result, is(expected));
    }
}