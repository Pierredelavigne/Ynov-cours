package org.example.creational.tp.factory;

public class Warrior extends Character {
    public Warrior() {
        this.name = "Warrior";
        this.health = 150;
        this.attack = 20;
    }

    @Override
    public void useSpecialSkill() {
        System.out.println("Warrior uses Shield Bash!");
    }
}
