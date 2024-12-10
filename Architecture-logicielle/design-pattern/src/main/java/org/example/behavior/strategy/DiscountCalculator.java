package org.example.behavior.strategy;

public class DiscountCalculator {
    private DiscountStrategy discountStrategy;

    public void setDiscount(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculatePrice(double price) {
        return discountStrategy.calculateDiscount(price);
    }


}
