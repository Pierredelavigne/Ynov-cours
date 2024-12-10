package org.example.behavior.strategy;

public class Demo {

    public static void main(String[] args) {

        DiscountCalculator discountCalculator = new DiscountCalculator();

        discountCalculator.setDiscount(new PremiumDiscount());

        System.out.println("Prix à payer pour un client premium " + discountCalculator.calculatePrice(500));

        discountCalculator.setDiscount(new StudentDiscount());

        System.out.println("Prix à payer pour un etudiant " + discountCalculator.calculatePrice(500));


        discountCalculator.setDiscount(new NoDiscount());

        System.out.println("Prix à payer sans remise " + discountCalculator.calculatePrice(500));

    }
}
