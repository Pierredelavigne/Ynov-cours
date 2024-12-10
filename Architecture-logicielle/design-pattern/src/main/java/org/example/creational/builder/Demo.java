package org.example.creational.builder;

public class Demo {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.setProcessor("intel");
        computer.setGraphicCardEnable(true);

        Computer computer2 = new Computer.ComputerBuilder("intel45",256).build();

        Computer computer3 = new Computer
                .ComputerBuilder("intel45",512)
                .isBluetoothEnable(true)
                .storage(50)
                .build();

        Computer computer4 = new Computer
                .ComputerBuilder("intel45",512)
                .storage(1000)
                .build();


    }
}
