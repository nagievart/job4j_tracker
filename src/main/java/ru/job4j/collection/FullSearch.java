package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FullSearch {
    public Set<String> extractNumber(List<NewTask> tasks) {
        HashSet<String> unicTasks = new HashSet(tasks);
        for (NewTask task : tasks) {
            unicTasks.add(task.getNumber());
        }
        return unicTasks;
    }
}
