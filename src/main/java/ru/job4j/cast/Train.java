package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Поезд двигается по рельсам");
    }

    @Override
    public void brake() {
        System.out.println("Поезд тормозит тормозными колодками");
    }
}
