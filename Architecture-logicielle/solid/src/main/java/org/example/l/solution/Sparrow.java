package org.example.l.solution;

public class Sparrow implements BirdFlying {

    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eating");
    }
}
