package io.github.amatheo.msc.exceptions;

public class Warrior extends Character {
    //Warrior
    //- RpgClass: “Warrior”
    //- life: 100
    //- strength: 10
    //- agility: 8
    //- wit:3

    public Warrior(String name) {
        super(name,"Warrior", 100, 10, 8, 3);
    }

    @Override
    void announce() {
        System.out.println(getPrefix() +"My name will go down in history!");
    }

    //implement the attack method. Its parameter defines the weapon used to attack.
    @Override
    public void attack(String weapon) throws WeaponException {
        if(weapon == null || weapon.isEmpty()){
            throw new WeaponException(getPrefix()+"I refuse to fight with my bare hands.");
        }
        if (!(weapon.equals("sword") || weapon.equals("hammer"))) {
            throw new WeaponException(getPrefix() + "A ["+weapon+"]?? What should I do with this?!");
        }else {
            super.attack(weapon);
            System.out.println(getPrefix() +" I'll crush you with my " + weapon + "!");
        }
    }

    @Override
    public void moveRight() {
        System.out.println(getPrefix() +"moves right like a bad boy.");
    }

    @Override
    public void moveLeft() {
        System.out.println(getPrefix() +"moves left like a bad boy.");
    }

    @Override
    public void moveForward() {
        System.out.println(getPrefix() +"moves forward like a bad boy.");
    }

    @Override
    public void moveBack(){
        System.out.println(getPrefix() +"moves back like a bad boy.");
    }

    //You must also implement a new method tryToAttack that call the attack methods, catch the exception and print the message.
    @Override
    public void tryToAttack(String message){
        try {
            this.attack(message);
        }catch (WeaponException e){
            System.out.println(e.getMessage());
        }
    }
}
