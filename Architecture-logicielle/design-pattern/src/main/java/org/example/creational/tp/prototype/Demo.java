package org.example.creational.tp.prototype;

public class Demo {

    public static void main(String[] args) {

        HouseModel house1 = new HouseModel();
        house1.setColor("Blue");
        System.out.println("House1 Color: " + house1.getColor());

        HouseModel house2 = (HouseModel) house1.clone();
        System.out.println("House2 Color: " + house2.getColor());

        house2.setColor("Green");
        System.out.println("House2 Color (after modification): " + house2.getColor());
        System.out.println("House1 Color (original): " + house1.getColor());
    }
}
