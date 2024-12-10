package org.example.i.problem;

public class Plane implements Vehicle{
    @Override
    public void drive() {
       throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    @Override
    public void sail() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
