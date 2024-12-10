package org.example.i.problem;

public class Boat implements Vehicle{
    @Override
    public void drive() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sail() {
        System.out.println("i'm sailing");
    }
}
