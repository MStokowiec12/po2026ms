package agh.po.lab5.animals;


public abstract class Animals {
    protected String name;
    protected int legs;

    public Animals(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }
    public int getLegs() {
        return legs;
    }
    public abstract String getDescription();

}
