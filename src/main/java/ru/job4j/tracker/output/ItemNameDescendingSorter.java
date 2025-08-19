package ru.job4j.tracker.output;

import ru.job4j.tracker.Item;

import java.util.Comparator;

public class ItemNameDescendingSorter implements Comparator<Item> {
    @Override
    public int compare(Item left, Item right) {
        return right.getName().compareTo(left.getName());
    }
}
