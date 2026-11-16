package agh.po.lab5.animals;

public class Snake extends Animals {
    public Snake(String name) {
        super(name, 0);
    }

    public String getDescription() {
        return "snake o imieniu " + name + ", liczba nóg: " + legs;
    }
}
