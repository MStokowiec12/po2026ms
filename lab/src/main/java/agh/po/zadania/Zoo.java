package agh.po.zadania;

import agh.po.lab5.animals.*;
public class Zoo {
    Animals[] animal = new Animals[100];

    public Zoo(){
        for (int i = 0; i < animal.length; i++) {
            int los = (int) (Math.random() * 3);

            if (los == 0) {
                animal[i] = new Parrot("Papuga");
            } else if (los == 1) {
                animal[i] = new Dog("Pies");
            } else {
                animal[i] = new Snake("Wąż");
            }
        }
    }
    public int getTotalLegs() {
        int sum = 0;
        for (Animals animal : animal) {
            if (animal != null) {
                sum += animal.getLegs();
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        System.out.println("Łączna liczba nóg w zoo: " + zoo.getTotalLegs());

        for (int i = 0; i < 5; i++) {
            System.out.println(zoo.animal[i].getDescription());
        }
    }
}


