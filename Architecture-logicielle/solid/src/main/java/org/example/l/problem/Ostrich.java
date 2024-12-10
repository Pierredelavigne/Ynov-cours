package org.example.l.problem;

public class Ostrich implements Bird{


    @Override
    public void fly() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eat() {
        System.out.println("Ostrich eat");
    }
}
