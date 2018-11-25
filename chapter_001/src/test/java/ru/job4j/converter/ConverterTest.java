package ru.job4j.converter;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {

    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    @Test
    public void testEuroToRuble() {
        Converter converter = new Converter();
        int res = converter.euroToRuble(5);
        assertThat(res, is(350));
    }
    @Test
    public void testDollarToRuble() {
        Converter converter = new Converter();
        int res = converter.dollarToRuble(5);
        assertThat(res, is(300));
    }



}
