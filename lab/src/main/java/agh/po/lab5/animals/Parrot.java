package agh.po.lab5.animals;

public class Parrot extends Animals {
    public Parrot(String name) {
        super(name, 2);
    }

    public String getDescription() {
        return "papuga o imieniu " + name + ", liczba nóg: " + legs;
    }
}