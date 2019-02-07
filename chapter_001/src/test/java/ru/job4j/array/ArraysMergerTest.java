package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ArraysMergerTest {
    @Test
    public void testArraysMerger() {
        ArraysMerger merger = new ArraysMerger();
        int[] a = new int[]{3, 7, 8, 9, 10};
        int[] b = new int[]{1, 3, 5, 7, 13};
        int[] mergedArrays = new int[]{1, 3, 3, 5, 7, 7, 8, 9, 10, 13};

        Assert.assertThat(merger.arraysMerger(a, b), is(mergedArrays));
    }
}
