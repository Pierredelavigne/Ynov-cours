package org.example.l.solution;

public class Demo {

    public static void main(String[] args) {

        Bird[] birds = new Bird[]{new Crow(), new Sparrow(), new Ostrich()};
        for (Bird bird : birds) {
            bird.eat();
        }

        BirdFlying[] birdFlyings = new BirdFlying[]{new Crow(), new Sparrow()};
        for (BirdFlying birdFlying : birdFlyings) {
            birdFlying.fly();
        }
    }
}
