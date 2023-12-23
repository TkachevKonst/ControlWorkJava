package org.example.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class BoxToy {

    private int sumQuantity;
    ArrayList<Toy> boxToy = new ArrayList<>();

    public void changeChance(){
        for (Toy value : boxToy) {
            double v = ((double)value.getQuantity() / sumQuantity)*100;
            value.setChance(v);
        }
    }
    public void add(Toy toy){
        for (int i = 0; i < toy.getQuantity(); i++) {
            boxToy.add(toy);
        }
        sumQuantity += toy.getQuantity();
        changeChance();
    }

    public void remove(int i){
        try {
            Toy toy = boxToy.get(i);
            sumQuantity --;
            boxToy.get(i).setQuantity(boxToy.get(i).getQuantity() - 1);
            boxToy.remove(i);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ящик с боксом пуст");
        }
    }
    public static void Save(Toy toy) {
        String text = toy.toString();
        String chance = String.format("%.2f",toy.getChance());
        try (FileWriter fw = new FileWriter("prize.txt", true)) {
            fw.write("Вы с вероятность "+chance+"% выиграли "+ text + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }


    public int getSumWeight() {
        return sumQuantity;
    }

    public String toString() {
        for (Toy toy: boxToy) {
            String.format(String.valueOf(toy));
        }
        return String.format(String.valueOf(boxToy+" "+sumQuantity));
    }


}
