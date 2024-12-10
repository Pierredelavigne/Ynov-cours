package org.example.i.solution;

import org.example.i.problem.Vehicle;

public class Plane implements Flyable, Drivable {
    @Override
    public void drive() {
        System.out.println("Plane driving");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }


}
