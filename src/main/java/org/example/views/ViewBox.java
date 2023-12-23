package org.example.views;

import org.example.model.Toy;
import org.example.presenter.View;
import org.example.presenter.ViewObserver;

import java.util.ArrayList;
import java.util.Collection;

public class ViewBox implements View {
    private Collection<ViewObserver> observers = new ArrayList<>();


    public void registerObserver(ViewObserver observer) {
        observers.add(observer);
    }

    public void showToys(Collection<Toy> toys) {
        for (Toy toy: toys) {
            System.out.println(toy);
        }
    }

    public void showAddToy(){
        System.out.println("Вы добавили игрушку в ящик");
    }

    public void showPullToy(int i){
        if (i>=0){
            System.out.println("Произошел розыгрыш игрушки \n *** \n");
        }else {
            System.out.println("Произошла ошибка");
        }
    }
    public void buttonAddToy(){
        System.out.println("Сейчас произведем добавление игрушки");
        for (ViewObserver viewObserver: observers) {
            viewObserver.onAddToy();
        }
    }

    public void buttonAddToy(String string){
        System.out.println("Сейчас произведем добавление игрушки");
        for (ViewObserver viewObserver: observers) {
            viewObserver.onAddToy(string);
        }
    }

    public void buttonPullToy(){
        System.out.println("Сейчас произведем розыгрыш игрушки");
        for (ViewObserver viewObserver: observers) {
            viewObserver.onPull();
        }
    }
}
