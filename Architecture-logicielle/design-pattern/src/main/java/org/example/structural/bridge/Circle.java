package org.example.structural.bridge;

public class Circle extends Shape {

    private int x;
    private int y;
    private int radius;

    public Circle(DrawApi drawApi, int x, int y, int radius) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    protected void draw() {
        drawApi.drawCircle(this.x, this.y, this.radius);
    }
}
