package ru.job4j.cast;

public class Casting {
    public static void main(String[] args) {
        Vehicle airbus = new Airplane();
        Vehicle sukhoiSuperJet = new Airplane();
        Vehicle boeing = new Airplane();
        Vehicle lastochka = new Train();
        Vehicle sapsan = new Train();
        Vehicle strizh = new Train();
        Vehicle liaz = new Bus();
        Vehicle volgaBus = new Bus();
        Vehicle nefaz = new Bus();
        Vehicle[] vehicles = new Vehicle[]{airbus, sukhoiSuperJet, boeing, lastochka, sapsan, strizh, liaz, volgaBus, nefaz};
        for (Vehicle object : vehicles) {
            object.move();
            object.brake();
        }
    }
}
