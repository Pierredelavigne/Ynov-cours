package org.example.structural.decorator;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "café noir";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
