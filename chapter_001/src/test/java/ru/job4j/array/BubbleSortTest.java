package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class BubbleSortTest {

    @Test
    public void testSort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[]{1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] expect = new int[]{0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(bubbleSort.sort(input), is(expect));

    }
}
