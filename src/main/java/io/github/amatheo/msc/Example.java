package io.github.amatheo.msc;

import io.github.amatheo.msc.exceptions.Character;
import io.github.amatheo.msc.exceptions.Mage;
import io.github.amatheo.msc.exceptions.Warrior;
import io.github.amatheo.msc.exceptions.WeaponException;

public class Example {
    public static void main(String[] args) {

        System.out.println("Step 2");
        //Step 02
        Character warrior = new Warrior("Jean-Luc");
        Character mage = new Mage("Robert");
        //warrior.attack("hammer");
        //mage.attack("magic");

        //Step 03 is internal to the class
        System.out.println("");
        System.out.println("Step 4");
        //Step 04
        warrior.moveRight();
        warrior.moveLeft();
        warrior.moveBack();
        warrior.moveForward();
        mage.moveRight();
        mage.moveLeft();
        mage.moveBack();
        mage.moveForward();

        System.out.println("");
        System.out.println("Step 6");
        //Step 06
        warrior.tryToAttack("screwdriver");
        mage.tryToAttack("hammer");
        warrior.tryToAttack("hammer");

        try {
            mage.attack(""); }
        catch (WeaponException e) {
            System.out.println(e.getMessage());
        }
  }
}
