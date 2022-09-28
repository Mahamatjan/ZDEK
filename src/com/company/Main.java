package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<Flower> flowers = new LinkedList<>();
        List<Bouquet> bouquets = Arrays.asList(Bouquet.values());
        flowers.add(new Flower("Roza",20,"red",10));
        flowers.add(new Flower("Tulpan",20,"fg",150));
        flowers.add(new Flower("Romashka",20,"tg",100));
        flowers.add(new Flower("Kyzgandak",20,"rt",120));
        flowers.add(new Flower("jgc",20,"tg",50));
        flowers.sort(Flower.conpareCost);
//        Random rand = new Random();
//        System.out.println(Bouquet.get(rand.nextInt(bouquets.size())));
//
//        public static <T extends Enum<?>> T randomEnum(Class<T> clazz){
//            int x = random.nextInt(clazz.getEnumConstants().length);
//            return clazz.getEnumConstants()[x];
//        }



        for (Flower i :flowers) {
            System.out.println(i);

        }



    }
}