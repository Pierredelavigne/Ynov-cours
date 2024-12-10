package org.example.i.solution;

import org.example.i.problem.Vehicle;

public class Boat implements Sailable {

    @Override
    public void sail() {
        System.out.println("Boat sailing");
    }
}
