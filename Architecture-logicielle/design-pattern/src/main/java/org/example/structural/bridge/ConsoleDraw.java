package org.example.structural.bridge;

public class ConsoleDraw implements DrawApi{
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing Circle in console with radius " + radius + " and center " + x + ", " + y);

    }

    @Override
    public void drawSquare(int x, int y, int side) {
        System.out.println("Drawing Square in console with side " + side + " and center " + x + ", " + y);
    }
}
