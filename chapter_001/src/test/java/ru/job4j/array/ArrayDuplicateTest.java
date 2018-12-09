package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ArrayDuplicateTest {

    @Test
    public void testRemove() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] in = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] out = {"Привет", "Мир", "Супер"};
        Assert.assertThat(arrayDuplicate.remove(in), is(out));
    }

    @Test
    public void testRemone2() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] in = {"Мама", "Мыла", "Мыла", "Раму", "М"};
        String[] out = {"Мама", "Мыла", "М", "Раму"};
        Assert.assertThat(arrayDuplicate.remove(in), is(out));
    }

}
