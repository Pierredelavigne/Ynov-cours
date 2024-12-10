package org.example.structural.bridge;

public class PaperDraw implements DrawApi{
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing circle on paper with radius " + radius + "and position " + x + ", " + y);
    }

    @Override
    public void drawSquare(int x, int y, int side) {

        System.out.println("Drawing square on paper with side " + side + "and position " + x + ", " + y);
    }
}
