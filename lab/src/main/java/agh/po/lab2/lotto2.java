package agh.po.lab2;
import java.util.ArrayList;
import java.util.Scanner;

public class lotto2 {
    public static void losowe (){
        ArrayList<Integer> liczby = new ArrayList<>();
        ArrayList<Integer> liczby2 = new ArrayList<>();
        for(int i = 0; i<6; i++){
            int rand = (int) ((Math.random() * 49 - 0)+1);
            liczby.add(rand);
            Scanner los = new Scanner(System.in);
            System.out.println("podaj " + (i+1) + " liczbę od 1 do 49");
            int los1 =los.nextInt();
            liczby2.add(los1);
        }
        System.out.println(liczby);
        System.out.println(liczby2);

    }

}
