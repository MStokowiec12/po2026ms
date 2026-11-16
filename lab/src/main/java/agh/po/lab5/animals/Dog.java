package agh.po.lab5.animals;

public class Dog extends Animals {
    public Dog(String name) {
        super(name, 4);
    }

    public String getDescription() {
        return "dog o imieniu " + name + ", liczba nóg: " + legs;
    }
}
