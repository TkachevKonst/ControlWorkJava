package org.example.presenter;

public class BoxPresenter implements ViewObserver {

    private final Model model;
    private final View view;

    public BoxPresenter(Model model, View view){
        this.model = model;
        this.view = view;
        this.view.registerObserver(this);
    }
    public void showToyBox(){
        view.showToys(model.loadToy());
    }
    @Override
    public void onAddToy() {
            model.addToy();
            view.showAddToy();

    }
    public void onAddToy(String string) {
        model.addToy(string);
        view.showAddToy();

    }

    @Override
    public void onPull() {
        System.out.println("Происходит розыгрыш игрушки");
        try {
            int i = model.pull();
            view.showPullToy(i);
        }catch (RuntimeException e){
            view.showPullToy(-1);
        }

    }
}
