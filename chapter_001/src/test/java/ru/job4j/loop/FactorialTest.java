package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test

    public void testCalc() {
        Factorial factorial = new Factorial();
        Assert.assertThat(factorial.calc(5), is(120));
    }

    @Test
    public void testCalc2() {
        Factorial factorial = new Factorial();
        Assert.assertThat(factorial.calc(0), is(1));
    }
}
