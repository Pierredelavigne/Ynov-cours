package org.example.structural.bridge;

public class Square extends Shape {

    private int x;
    private int y;
    private int side;

    public Square(DrawApi drawApi, int x, int y, int side) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.side = side;
    }

    @Override
    protected void draw() {
    drawApi.drawSquare(this.x, this.y, this.side);
    }
}
