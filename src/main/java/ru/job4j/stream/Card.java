package ru.job4j.stream;

import ru.job4j.stream.Suit;
import ru.job4j.stream.Value;

import java.util.List;
import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
        String[] suits = {Suit.Clubs.toString(), Suit.Hearts.toString(),
                Suit.Spades.toString(), Suit.Diamonds.toString()};
        String[] values = {Value.V_6.toString(), Value.V_7.toString(), Value.V_8.toString()};

        Stream.of(suits)
                .flatMap(suit -> Stream.of(values)
                        .map(value -> new Card(Suit.valueOf(suit), Value.valueOf(value))))
                .forEach(System.out::println);
    }
}