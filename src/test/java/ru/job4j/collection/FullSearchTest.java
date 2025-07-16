package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FullSearchTest {

    @Test
    public void whenExtractNumberWithDuplicates() {
        FullSearch fullSearch = new FullSearch();
        List tasks = Arrays.asList(
                new NewTask("1", "First desc"),
                new NewTask("2", "Second desc"),
                new NewTask("1", "First desc")
        );
        var expected = new HashSet<>(Arrays.asList("1", "2"));
        assertThat(fullSearch.extractNumber(tasks)).containsAll(expected);
    }

    @Test
    public void whenExtractNumberWithUniqueTasks() {
        FullSearch fullSearch = new FullSearch();
        List tasks = Arrays.asList(
                new NewTask("1", "First desc"),
                new NewTask("2", "Second desc"),
                new NewTask("3", "Third desc")
        );
        var expected = new HashSet<>(Arrays.asList("1", "2", "3"));
        assertThat(fullSearch.extractNumber(tasks)).containsAll(expected);
    }

    @Test
    public void whenExtractNumberWithEmptyList() {
        FullSearch fullSearch = new FullSearch();
        List tasks = List.of();
        assertThat(fullSearch.extractNumber(tasks)).isEmpty();
    }

    @Test
    public void whenExtractNumberWithAllTasksHavingSameNumber() {
        FullSearch fullSearch = new FullSearch();
        List tasks = Arrays.asList(
                new NewTask("1", "First desc"),
                new NewTask("1", "Second desc"),
                new NewTask("1", "Third desc")
        );
        Set expected = Set.of("1");
        assertThat(fullSearch.extractNumber(tasks)).containsAll(expected);
    }
}