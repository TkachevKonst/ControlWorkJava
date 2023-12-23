package org.example.model;

import org.example.presenter.Model;

import java.util.ArrayList;
import java.util.Random;

public class ModelBox implements Model {
    Random random = new Random();
    BoxToy boxToy = new BoxToy();



    public void addToy() {
        boxToy.add(new Toy());
    }

    public void addToy(String string) {
        boxToy.add(new Toy(string));
    }

    public int pull() {
        if (!boxToy.boxToy.isEmpty()) {
            int i = random.nextInt(boxToy.boxToy.size());
            double v = boxToy.boxToy.get(i).getChance();
            String chance = String.format("%.2f", v);
            System.out.println("Вы с вероятность " + chance + "% выиграли " + boxToy.boxToy.get(i).getId() + " " + boxToy.boxToy.get(i).getName());
            BoxToy.Save(boxToy.boxToy.get(i));
            boxToy.remove(i);
            boxToy.changeChance();
            return i;
        }
        throw new RuntimeException("Ящик пуст");

    }
    public ArrayList<Toy> loadToy(){
        if (boxToy.boxToy == null){
            boxToy.add(new Toy());
        }
        return boxToy.boxToy;
    }
}

