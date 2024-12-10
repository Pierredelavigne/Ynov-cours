package org.example.creational.prototype.ssproto;

public class Demo {



    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(90, 70, "blue");
        Rectangle rectangleClone = new Rectangle(rectangle.getWidth(), rectangle.getHeight(), rectangle.getColor());

        Rectangle rectangle3 = rectangle;

        System.out.println(rectangle == rectangleClone);
        System.out.println(rectangle == rectangle3);
    }




}
