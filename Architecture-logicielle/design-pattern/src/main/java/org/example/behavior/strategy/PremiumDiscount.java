package org.example.behavior.strategy;

public class PremiumDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.5;
    }
}
