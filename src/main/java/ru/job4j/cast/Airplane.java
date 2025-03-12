package ru.job4j.cast;

public class Airplane implements Vehicle {

    @Override
    public void move() {
        System.out.println("Самолет летит по небу");
    }

    @Override
    public void brake() {
        System.out.println("Самолет тормозит спойлерами и реверсом");
    }
}
