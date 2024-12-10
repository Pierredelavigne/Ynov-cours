package org.example.creational.tp.prototype;

public class CarModel extends Model3D {
    public CarModel() {
        this.size = "Medium";
        this.color = "Red";
        this.texture = "Metallic";
    }

    @Override
    public Model3D clone() {
        CarModel copy = new CarModel();
        copy.setSize(this.size);
        copy.setColor(this.color);
        copy.setTexture(this.texture);
        return copy;
    }
}
