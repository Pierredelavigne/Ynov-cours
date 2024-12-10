package org.example.structural.adapter;

public class PlugAdapter implements EuropeanPlug{

    private AmericanPlug americanPlug;

    public PlugAdapter(AmericanPlug americanPlug) {
        this.americanPlug = americanPlug;
    }

    @Override
    public void connectToEuropeanPlug() {
        System.out.println("Adapteur en cours ...");
        americanPlug.connectToAmericanPlug();
    }
}
