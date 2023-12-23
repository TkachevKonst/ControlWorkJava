package org.example.presenter;

import org.example.model.Toy;

import java.util.Collection;

public interface View {
    void registerObserver(ViewObserver observer);
    public void showToys(Collection<Toy> toys);
    public void showAddToy();
    public void showPullToy(int i);
}
