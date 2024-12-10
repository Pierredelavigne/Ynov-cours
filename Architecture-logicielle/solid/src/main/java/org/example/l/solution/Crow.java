package org.example.l.solution;

public class Crow implements BirdFlying {

    @Override
    public void fly() {
        System.out.println("Crow flying");
    }

    @Override
    public void eat() {
        System.out.println("Crow eating");
    }
}
