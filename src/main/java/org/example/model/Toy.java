package org.example.model;

import java.util.Random;
import java.util.Scanner;

public class Toy implements Comparable<Toy>{
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private static int count = 1;
    private final int id;
    private String name;
    private int quantity;

    private double chance;

    public Toy(String name){
        this.name = name;
        id = count++;
        quantity = random.nextInt(1,10);
    }
    public Toy(){
        System.out.println("Введите название игрушки");
        name = scanner.nextLine();
        id = count++;
        quantity = random.nextInt(10);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getChance() {
        return chance;
    }

    public void setChance(double chance) {
        this.chance = chance;
    }

    @Override
    public String toString() {
        return String.format("id № "+id+" "+name);
    }

    @Override
    public int compareTo(Toy toy) {
        return toy.getQuantity() - quantity;
    }




}
