package com.company;

import java.util.LinkedList;

public class Bouquet1 extends Flower{
    public Bouquet1(String name, int length, String color, int cost, Bouquet bouquet) {
        super(name, length, color, cost);


        LinkedList<Flower> flowers = new LinkedList<>();
        flowers.add(new Flower("Roza", 20, "red", 10));
        flowers.add(new Flower("Tulpan", 20, "fg", 150));
        flowers.add(new Flower("Romashka", 20, "tg", 100));
        flowers.add(new Flower("Kyzgandak", 20, "rt", 120));
        flowers.add(new Flower("jgc", 20, "tg", 50));


    }

}
