package ru.job4j.tracker;

import ru.job4j.tracker.output.ItemNameDescendingSorter;

import java.util.Arrays;
import java.util.List;

public class ItemDescByName {
    public static List<Item> descendingOrderSort(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(1, "Karl"),
                new Item(2, "Michael"),
                new Item(3, "Arthur")
        );
        items.sort(new ItemNameDescendingSorter());
        return  items;
    }
}
