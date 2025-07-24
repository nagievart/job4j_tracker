package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("nagiev-art@mail.ru", "Нагиев А.Р.");
        myMap.put("nagievart1995@gmail.com", "Нагиев А.Р.");
        myMap.put("kek", "NoName User");
        myMap.put("kek", "Нагиев А.Р.");
        for (String key : myMap.keySet()) {
            String value = myMap.get(key);
            System.out.println(key + "  =   " + value);
        }
    }
}
