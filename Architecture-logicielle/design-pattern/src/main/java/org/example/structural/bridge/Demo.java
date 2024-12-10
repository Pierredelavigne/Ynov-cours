package org.example.structural.bridge;

public class Demo {
    public static void main(String[] args) {

        Circle circle = new Circle(new PaperDraw(), 7,90,45);
        circle.draw();

        Square square = new Square(new ConsoleDraw(), 7,90,45);
        square.draw();

    }
}
