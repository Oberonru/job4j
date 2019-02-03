package ru.job4j.taskOfTest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class TaskOfTesttest {

    @Test
    public void testSortArray() {
    TaskOfTest taskOfTest = new TaskOfTest();
    int[] array = new int[] {5, 8, 1, 0, 4, 2, 12, 12, 43, 6};
    int[] array2 = new int[] {15, 3, 0, 21, 4, 6, 9, 7, 4, 63};
    int[] result0 = new int[] {3, 4, 4, 6, 7, 9, 15, 21, 63};
    Assert.assertThat(taskOfTest.resultSort(array, array2), is(result0));
    }

}
