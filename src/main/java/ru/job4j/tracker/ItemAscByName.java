package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ItemAscByName {
    public static List<Item> ascendingOrderSort(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(1, "Karl"),
                new Item(2, "Michael"),
                new Item(3, "Arthur")
        );
        items.sort(new ItemNameAscendingSorter());
        return  items;
    }
}
