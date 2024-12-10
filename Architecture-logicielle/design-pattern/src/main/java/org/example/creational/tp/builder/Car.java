package org.example.creational.tp.builder;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String engine;
    private String color;
    private int seats;
    private List<String> extras;

    private Car(CarBuilder builder) {
        this.model = builder.model;
        this.engine = builder.engine;
        this.color = builder.color;
        this.seats = builder.seats;
        this.extras = builder.extras;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public int getSeats() {
        return seats;
    }

    public List<String> getExtras() {
        return extras;
    }

    public void displayCar() {
        System.out.println("Car Details:");
        System.out.println("Model: " + model);
        System.out.println("Engine: " + engine);
        System.out.println("Color: " + color);
        System.out.println("Seats: " + seats);
        System.out.println("Extras: " + (extras.isEmpty() ? "None" : String.join(", ", extras)));
    }

    public static class CarBuilder {
        private String model;
        private String engine;
        private String color = "undefined"; // Default value
        private int seats;
        private List<String> extras = new ArrayList<>();


        public CarBuilder setModel(String model) {
            if (!model.equals("SUV") && !model.equals("Berline") && !model.equals("Sport")) {
                throw new IllegalArgumentException("Invalid model type.");
            }
            this.model = model;
            return this;
        }

        public CarBuilder setEngine(String engine) {
            if (!engine.equals("Électrique") && !engine.equals("Hybride") && !engine.equals("Essence")) {
                throw new IllegalArgumentException("Invalid engine type.");
            }

            if (model != null && model.equals("Sport") && engine.equals("Électrique")) {
                throw new IllegalArgumentException("A Sport model cannot have an electric engine.");
            }

            this.engine = engine;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            if (model != null && model.equals("SUV") && seats < 5) {
                throw new IllegalArgumentException("SUVs must have at least 5 seats.");
            }
            this.seats = seats;
            return this;
        }

        public CarBuilder addExtra(String extra) {
            extras.add(extra);
            return this;
        }


        public Car build() {
            if (model == null || engine == null || seats == 0) {
                throw new IllegalStateException("Model, engine, and seats must be specified.");
            }
            return new Car(this);
        }
    }
}
