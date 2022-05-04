package io.github.amatheo.msc.exceptions;

public class Mage extends Character {
    //Mage
    //- RpgClass: “Mage”
    //- life: 70
    //- strength: 3
    //- agility: 10
    //- wit: 10

    public Mage(String name) {
        super(name,"Mage", 70, 3, 10, 10);
    }

    @Override
    void announce() {
        System.out.println(getPrefix() +"May the gods be with me.");
    }

    @Override
    public void attack(String weapon) throws WeaponException{
        if(weapon == null || weapon.isEmpty()){
            throw new WeaponException(getPrefix()+"I refuse to fight with my bare hands.");
        }

        if (!(weapon.equals("magic") || weapon.equals("wand"))) {
            throw new WeaponException("[" + this.name + "]: " + "I don't need this stupid [" + weapon + "]! Don't misjudge my powers!");
        }else {
            super.attack(weapon);
            System.out.println(getPrefix() +"Feel the power of my " + weapon + "!");
        }
    }

    @Override
    public void moveBack() {
        System.out.println(getPrefix() +"moves back furtively.");
    }

    @Override
    public void moveForward() {
        System.out.println(getPrefix() +"moves forward furtively.");
    }

    @Override
    public void moveLeft() {
        System.out.println(getPrefix() +"moves left furtively.");
    }

    @Override
    public void moveRight() {
        System.out.println(getPrefix() +"moves right furtively.");
    }

    @Override
    public void tryToAttack(String message) {
        try {
            this.attack(message);
        }catch (WeaponException e){
            System.out.println(e.getMessage());
        }
    }

}
