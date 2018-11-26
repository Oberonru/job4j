package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class FitTest {

    @Test
    public void testManWeight() {
        Fit fit = new Fit();
        double result = fit.manWeight(180);
        Assert.assertThat(result, closeTo(92.0, 0.1));
    }

    @Test
    public void testWomanWeight() {
        Fit fit = new Fit();
        double result = fit.womanWeight(170);
        Assert.assertThat(result, closeTo(69.0, 0.1));
    }
}
