package org.example.creational.factory;

public class Demo {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");

        Shape square = shapeFactory.getShape("square");

        Shape rectangle = shapeFactory.getShape("rectangle");

        circle.draw();
        square.draw();
        rectangle.draw();


    }
}
