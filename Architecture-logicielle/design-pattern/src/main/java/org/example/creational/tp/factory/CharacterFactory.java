package org.example.creational.tp.factory;

public class CharacterFactory {

    public Character createCharacter(String type) {
        switch (type.toLowerCase()) {
            case "warrior":
                return new Warrior();
            case "mage":
                return new Mage();
            case "archer":
                return new Archer();
            default:
                throw new IllegalArgumentException("Unknown character type.");
        }
    }
}
