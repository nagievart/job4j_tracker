package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.output.ItemNameDescendingSorter;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ItemDescByNameTest {

    @Test
    void descendingOrderSort() {
        //given
        List<Item> items = Arrays.asList(
                new Item(2, "Mariia"),
                new Item(3, "Arthur"),
                new Item(1, "Karl")
        );

        //when
        items.sort(new ItemNameDescendingSorter());

        List<Item> expected = Arrays.asList(
                new Item(2, "Mariia"),
                new Item(1, "Karl"),
                new Item(3, "Arthur")

        );

        //then
        assertEquals(expected, items);
    }
}