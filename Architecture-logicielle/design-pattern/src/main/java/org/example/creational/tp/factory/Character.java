package org.example.creational.tp.factory;

public abstract class Character {

    protected String name;
    protected int health;
    protected int attack;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public abstract void useSpecialSkill();
}
