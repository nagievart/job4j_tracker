package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();
        wolf.tryEat(ball);
        fox.tryEat(ball);
        hare.tryEat(ball);
    }
}
