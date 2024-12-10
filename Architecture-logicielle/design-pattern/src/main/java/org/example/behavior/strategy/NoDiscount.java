package org.example.behavior.strategy;

public class NoDiscount implements DiscountStrategy{
    @Override
    public double calculateDiscount(double price) {
        return price;
    }
}
