package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int minLength = Math.min(left.length(), right.length());

        for (int i = 0; i < minLength; i++) {
        char leftChar = left.charAt(i);
        char rightChar = right.charAt(i);

        int charsComparison = Character.compare(leftChar, rightChar);

        if (charsComparison != 0) {
            return charsComparison;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}