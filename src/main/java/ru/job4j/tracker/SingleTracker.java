package ru.job4j.tracker;

public class SingleTracker {

    private static final SingleTracker INSTANCE = new SingleTracker();

    private final Tracker tracker = new Tracker();

    private SingleTracker() {
    }

    public static SingleTracker getInstance() {
        return INSTANCE;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public void delete(int id) {
        tracker.delete(id);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }
}
