package ru.job4j.trackStudio;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class TrackerrTest {
    @Test
    public void testAdd() {
        Tracker tracker = new Tracker();
        Long created = System.currentTimeMillis();
        Item item = new Item("1", "2", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        Assert.assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void testReplace() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "testDescription2", 1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        Assert.assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void testFindById() {
        Tracker tracker = new Tracker();
        Item item = new Item("test", "testFindById", 123L);
        tracker.add(item);
        Assert.assertThat(tracker.findById(item.getId()).getName(), is("test"));
    }

}
