package io.github.amatheo.msc.exceptions;


public abstract class Character implements Movable{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public String getRpgClass() {
        return RpgClass;
    }

    //Create an abstract Character class that is composed of the following protected attributes: “name”, “life”, “agility”, “strength”, “wit”, and a constant “RpgClass” string attribute, with the corresponding getters.
    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;
    protected final String RpgClass;

    public Character(String name, String RpgClass, int life, int agility, int strength, int wit) {
        this.name = name;
        this.life = life;
        this.agility = agility;
        this.strength = strength;
        this.wit = wit;
        this.RpgClass = RpgClass;
        announce();
    }

    //These attributes must have the following values by default:
    //• name:first argument passed to constructor
    //• RpgClass: second argument passed to constructor
    //• life:50
    //• agility:2
    //• strength:2
    //• wit:2
    public Character(String name, String RpgClass) {
        this.name = name;
        this.RpgClass = RpgClass;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
        announce();
    }
    abstract void announce();

    //Add an attack method that takes a string as argument, and prints the following (whatever the argument): [name]: Rrrrrrrrr....
    public void attack(String weapon) throws WeaponException {
        System.out.println(getPrefix() + "Rrrrrrrrr....");
    }

    @Override
    public void moveBack() {
        System.out.println(getPrefix() + "moves back");
    }

    @Override
    public void moveForward() {
        System.out.println(getPrefix() + "moves forward");
    }

    @Override
    public void moveLeft() {
        System.out.println(getPrefix() + "moves left");
    }

    @Override
    public void moveRight() {
        System.out.println(getPrefix()+ "moves right");
    }

    public final void unsheathe() {
        System.out.println(getPrefix() + "unsheathes his weapon");
    }
    public abstract void tryToAttack(String message);

    public String getPrefix() {
        return "["+this.name+ "]: ";
    }
}
