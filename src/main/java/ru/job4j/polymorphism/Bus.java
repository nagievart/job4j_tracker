package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("Метод для реализации функции движения");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Метод для определния количества пассажиров");
    }

    @Override
    public int refuel(int fuel) {
        System.out.println("Метод для опредедния стоимости заправки");
        return 0;
    }
}
