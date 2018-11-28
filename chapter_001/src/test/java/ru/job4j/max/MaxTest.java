package ru.job4j.max;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void testMax() {
        Max mx = new Max();
        assertThat(mx.max(3, 5), is(5));
    }
    @Test
    public void testMax2() {
        Max mx = new Max();
        assertThat(mx.max(3, 5), is(5));
    }



    @Test
    public void testMaxThree() {
        Max mx = new Max();
        Assert.assertThat(mx.max(1, 2, 3), is(3));
    }
}

