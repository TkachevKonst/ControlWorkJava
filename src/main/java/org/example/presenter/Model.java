package org.example.presenter;

import org.example.model.Toy;

import java.util.ArrayList;

public interface Model {

    public void addToy();
    public void addToy(String string);

    public int pull();
    public ArrayList<Toy> loadToy();
}
