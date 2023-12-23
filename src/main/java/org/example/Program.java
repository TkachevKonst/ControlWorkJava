package org.example;


import org.example.model.ModelBox;
import org.example.presenter.BoxPresenter;
import org.example.views.ViewBox;

public class Program {
    public static void main(String[] args) {
        ModelBox modelBox = new ModelBox();
        ViewBox viewBox = new ViewBox();
        BoxPresenter boxPresenter = new BoxPresenter(modelBox, viewBox);
        viewBox.buttonAddToy("тетрис");
        viewBox.buttonAddToy("мишка");
        viewBox.buttonAddToy("кукла");
        viewBox.buttonPullToy();
        viewBox.buttonPullToy();

    }
}
