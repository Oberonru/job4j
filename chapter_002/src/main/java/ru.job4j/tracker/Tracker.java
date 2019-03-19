package ru.job4j.tracker;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Tracker {
    private Item[] items = new Item[100];
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;


    /**
     * добавление заявок
     *
     * @param item
     * @return
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * редактирование заявок
     *
     * @param id
     * @param item
     * @return
     */
    public boolean replace(String id, Item item) {
        item.setId(id);
        for (int i = 0; i < 100; i++) {
            if (id.equals(item.getId())) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    /**
     * удаление заявок
     *
     * @param id
     * @return
     */
    public boolean delete(String id) {
        Item[] newItems = new Item[items.length - 1];
        boolean isDeleted = false;
        int i = 0;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                isDeleted = true;
            } else {
                newItems[i] = item;
                i++;
            }
        }
        items = newItems;
//        for (int i = 0; i < items.length; i++) {
//            if (items[i] != null && items[i].equals(id)) {
//                System.arraycopy(items, 0, newItems, 0, i);
//                System.arraycopy(items, i + 1, newItems, i, items.length - i - 1);
//                return true;
//            }
//        }
        return isDeleted;
    }

    /**
     * получение списка всех заявок
     *
     * @return
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    /**
     * получение списка по имени
     *
     * @param key
     * @return
     */
    public Item[] findByName(String key) {
        ArrayList<Item> result = new ArrayList<Item>();
        for (Item item : result) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return (Item[])result.toArray();
    }

    /**
     * получение заявки по id
     *
     * @param id
     * @return
     */
    public Item findById(String id) {
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random random = new Random();
        Date currentTime = new Date();
        return String.valueOf(currentTime.getTime() + Math.abs(random.nextLong()));
    }
}
