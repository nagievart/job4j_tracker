package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException();
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            int temp = indexOf(new String[] {"Строка1", "Строка2", "Строка3"}, "Строка3");
        } catch (ElementNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
