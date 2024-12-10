package org.example.creational.builder;

public class Computer {

    // attributs obligatoires
    private String processor;
    private int ram;

    // attributs optionnels
    private int storage;
    private boolean isGraphicCardEnable;
    private boolean isBluetoothEnable;

    public Computer() {
    }

    public Computer(ComputerBuilder builder) {
                this.processor = builder.processor;
                this.ram = builder.ram;
                this.storage = builder.storage;
                this.isGraphicCardEnable = builder.isGraphicCardEnable;
                this.isBluetoothEnable = builder.isBluetoothEnable;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public boolean isGraphicCardEnable() {
        return isGraphicCardEnable;
    }

    public void setGraphicCardEnable(boolean graphicCardEnable) {
        isGraphicCardEnable = graphicCardEnable;
    }

    public boolean isBluetoothEnable() {
        return isBluetoothEnable;
    }

    public void setBluetoothEnable(boolean bluetoothEnable) {
        isBluetoothEnable = bluetoothEnable;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", isGraphicCardEnable=" + isGraphicCardEnable +
                ", isBluetoothEnable=" + isBluetoothEnable +
                '}';
    }

    public static class ComputerBuilder {

        // attributs obligatoires
        private String processor;
        private int ram;

        // attributs optionnels
        private int storage;
        private boolean isGraphicCardEnable = false;
        private boolean isBluetoothEnable = false;

        public ComputerBuilder(String processor, int ram) {
            this.processor = processor;
            this.ram = ram;
        }

        public ComputerBuilder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder isGraphicCardEnable(boolean isGraphicCardEnable) {
            this.isGraphicCardEnable = isGraphicCardEnable;
            return this;
        }

        public ComputerBuilder isBluetoothEnable(boolean isBluetoothEnable) {
            this.isBluetoothEnable = isBluetoothEnable;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }



}
