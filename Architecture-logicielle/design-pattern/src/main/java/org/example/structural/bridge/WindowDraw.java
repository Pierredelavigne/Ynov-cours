package org.example.structural.bridge;

public class WindowDraw implements DrawApi{
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("draw circle on window with " + radius + " radius" + "position " + x + " , " + y);
    }

    @Override
    public void drawSquare(int x, int y, int side) {
        System.out.println("draw square on window with " + side + " side" + "position " + x + " , " + y);
    }
}
