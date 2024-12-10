package org.example.creational.tp.prototype;


public class HouseModel extends Model3D {
    public HouseModel() {
        this.size = "Large";
        this.color = "White";
        this.texture = "Brick";
    }

    @Override
    public Model3D clone() {
        HouseModel copy = new HouseModel();
        copy.setSize(this.size);
        copy.setColor(this.color);
        copy.setTexture(this.texture);
        return copy;
    }
}
