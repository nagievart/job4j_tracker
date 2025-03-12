package ru.job4j.cast;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println("Автобус двигается по дороге");
    }

    @Override
    public void brake() {
        System.out.println("Автобус тормозит тормозными цилиндрами");
    }
}
