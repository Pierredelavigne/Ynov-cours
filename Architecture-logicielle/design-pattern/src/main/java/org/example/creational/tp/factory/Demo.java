package org.example.creational.tp.factory;
import org.example.creational.tp.factory.*;

public class Demo {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        Character warrior = factory.createCharacter("warrior");
        System.out.println(warrior.getName() + " - Health: " + warrior.getHealth() + ", Attack: " + warrior.getAttack());
        warrior.useSpecialSkill();

        Character mage = factory.createCharacter("mage");
        System.out.println(mage.getName() + " - Health: " + mage.getHealth() + ", Attack: " + mage.getAttack());
        mage.useSpecialSkill();

        Character archer = factory.createCharacter("archer");
        System.out.println(archer.getName() + " - Health: " + archer.getHealth() + ", Attack: " + archer.getAttack());
        archer.useSpecialSkill();
    }
}
