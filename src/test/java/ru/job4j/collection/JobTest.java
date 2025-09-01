package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorByNameAndPriorityWithEqualNames() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Artur", 0),
                new Job("Artur", 1)
        );
        assertThat(rsl).isEqualTo(1);
    }

    @Test
    public void whenComparatorByPriorityAndNameWithEqualNames() {
        Comparator<Job> cmpPriorityName = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpPriorityName.compare(
                new Job("Artur", 0),
                new Job("Artur", 1)
        );
        assertThat(rsl).isEqualTo(1);
    }

    @Test
    public void whenComparatorByPriorityAndNameWithEqualPriority() {
        Comparator<Job> cmpPriorityName = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpPriorityName.compare(
                new Job("Artur", 1),
                new Job("Mariia", 1)
        );
        assertThat(rsl).isGreaterThan(1);
    }

    @Test
    public void whenDescByName() {
        Comparator<Job> descNameComparator = new JobDescByName();
        int rsl = descNameComparator.compare(
                new Job("Artur", 1),
                new Job("Mariia", 1)
        );
        assertThat(rsl).isGreaterThan(1);
    }

    @Test
    public void whenDescByPriority() {
        Comparator<Job> descPriorityComparator = new JobDescByPriority();
        int rsl = descPriorityComparator.compare(
                new Job("Artur", 1),
                new Job("Mariia", 1)
        );
        assertThat(rsl).isEqualTo(0);
    }

    @Test
    public void whenAscByPriority() {
        Comparator<Job> ascPriorityComparator = new JobAscendingByPriority();
        int rsl = ascPriorityComparator.compare(
                new Job("Artur", 1),
                new Job("Mariia", 0)
        );
        assertThat(rsl).isEqualTo(1);
    }

    @Test
    public void whenAscByName() {
        Comparator<Job> ascNameComparator = new JobAscendingByName();
        int rsl = ascNameComparator.compare(
                new Job("Artur", 1),
                new Job("Mariia", 0)
        );
        assertThat(rsl).isLessThan(-1);
    }
}