package org.example.i.problem;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("i'm a driving");
    }

    @Override
    public void fly() {
    throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sail() {
    throw new UnsupportedOperationException("Not supported yet.");
    }
}
