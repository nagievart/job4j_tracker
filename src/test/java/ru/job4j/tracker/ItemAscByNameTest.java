package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class ItemAscByNameTest {

    @Test
    void ascendingOrderSort() {
        //given
        List<Item> items = Arrays.asList(
                new Item(2, "Mariia"),
                new Item(3, "Arthur"),
                new Item(1, "Karl")
        );

        //when
        items.sort(new ItemNameAscendingSorter());

        List<Item> expected = Arrays.asList(
                new Item(3, "Arthur"),
                new Item(1, "Karl"),
                new Item(2, "Mariia")
        );

        //then
        assertEquals(expected, items);
    }
}