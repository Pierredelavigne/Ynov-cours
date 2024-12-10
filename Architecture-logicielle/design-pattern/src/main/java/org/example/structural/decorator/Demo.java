package org.example.structural.decorator;

public class Demo {
    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();
        System.out.println("Coffee, prix : " + coffee.cost() + ", descritpion : " + coffee.getDescription() );

        Coffee milkCoffe = new MilkDecorator(coffee);
        System.out.println("Coffee, prix : " + milkCoffe.cost() + ", descritpion : " + milkCoffe.getDescription() );

        Coffee sugarCoffeMilk = new SugarDecorator(milkCoffe);
        System.out.println("Coffee, prix : " + sugarCoffeMilk.cost() + ", descritpion : " + sugarCoffeMilk.getDescription() );

        Coffee sugarCoffee = new SugarDecorator(coffee);
        System.out.println("Coffee, prix : " + sugarCoffee.cost() + ", descritpion : " + sugarCoffee.getDescription() );
    }
}
