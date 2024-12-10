package org.example.structural.adapter;

public class Demo {
    public static void main(String[] args) {

            AmericanPlug americanPlug = new AmericanPlug();

            EuropeanPlug europeanPlug = new PlugAdapter(americanPlug);

            europeanPlug.connectToEuropeanPlug();

    }
}
