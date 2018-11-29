package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import java.util.StringJoiner;
import java.util.regex.Pattern;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PaintTest {

    @Test
    public void testPyramid() {
        Paint paint = new Paint();
        String res = paint.pyramid(4);
        Assert.assertThat(res, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("   ^   ")
                .add("  ^^^  ")
                .add(" ^^^^^ ")
                .add("^^^^^^^")
                .toString()));
    }


}
