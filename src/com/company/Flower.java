package com.company;

import java.util.Comparator;

public  class Flower {
    private String name;
    private int length;
    private String color;
    private int cost;


    public Flower(String name, int length, String color, int cost) {
        this.name = name;
        this.length = length;
        this.color = color;
        this.cost = cost;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }

    public static Comparator<Flower> conpareCost = new Comparator<Flower>() {
        @Override
        public int compare(Flower o1, Flower o2) {
            return o1.cost - o2.getCost();
        }
    };



}
