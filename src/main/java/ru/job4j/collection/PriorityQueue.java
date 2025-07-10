package ru.job4j.collection;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (element.getPriority() <= task.getPriority()) {
                index++;
            }
            if (element.getPriority() > task.getPriority()) {
                tasks.add(index, task);
                break;
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}
