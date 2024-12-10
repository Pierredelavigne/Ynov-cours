package org.example.l.problem;

public class Crow implements Bird{
    @Override
    public void fly() {
        System.out.println("Crow flying");
    }

    @Override
    public void eat() {
        System.out.println("Crow eating");
    }
}
