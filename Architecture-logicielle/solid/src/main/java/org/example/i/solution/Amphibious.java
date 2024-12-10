package org.example.i.solution;

public class Amphibious implements Sailable, Drivable{
    @Override
    public void drive() {
        System.out.println("i'm driving");
    }

    @Override
    public void sail() {
        System.out.println("i'm sailing");
    }
}
