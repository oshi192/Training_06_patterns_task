package ex5salad.controller;

import ex5salad.model.*;
import ex5salad.view.View;
import util.Reader;

public class Controller {
    private Salad salad;
    private View view;

    public Controller(Salad salad, View view) {
        this.salad = salad;
        this.view = view;
    }

    public void createSalad() {
        chooseComponents();
        salad.setDish(chooseDish());
        salad.setFlavouring(chooseFlavouring());
        salad.setSpice(chooseSpice());
        if (checkComponents()) {
            view.print(View.ERROR_CANNT_CREATE);
            view.print(salad.missedComponents());
            view.print("--"+salad.components());
        } else {
            view.print(salad.components());
        }
    }

    private boolean checkComponents() {
        return salad.getIngridients().size() == 0 ||
                salad.getDish() == Dish.NONE ||
                salad.getFlavouring() == Flavouring.NONE ||
                salad.getSpice() == Spice.NONE;
    }



    private Flavouring chooseFlavouring() {
        view.print(View.FLAVOURING_CHOOSE);
        for (int i = 1; i < Flavouring.values().length; i++) {
            view.print(i + View.DOTS + Flavouring.values()[i].name());
        }
        return Flavouring.values()
                [Reader.getAnswer(View.ANSWER, 1, (Flavouring.values().length - 1))];
    }

    private Ingredient chooseOneComponent() {
        view.print(View.INGREDIENTS_CHOOSE);
        for (int i = 1; i < Ingredient.values().length; i++) {
            view.print(i + View.DOTS + Ingredient.values()[i].name());
        }
        return Ingredient.values()
                [Reader.getAnswer(View.ANSWER, 1, (Ingredient.values().length - 1))];
    }

    private Spice chooseSpice() {
        view.print(View.SPICE_CHOOSE);
        for (int i = 1; i < Spice.values().length; i++) {
            view.print(i + View.DOTS + Spice.values()[i].name());
        }
        return Spice.values()
                [Reader.getAnswer(View.ANSWER, 1, (Spice.values().length - 1))];
    }

    private void chooseComponents() {
        Ingredient ingridient;
        do {
            ingridient = chooseOneComponent();
            if (ingridient != Ingredient.NONE) {
                salad.addIngridient(ingridient);
            }
        } while (ingridient != Ingredient.NONE);
    }

    private Dish chooseDish() {
        view.print(View.DISH_CHOOSE);
        for (int i = 1; i < Dish.values().length; i++) {
            view.print(i + View.DOTS + Dish.values()[i].name());
        }
        return Dish.values()
                [Reader.getAnswer(View.ANSWER, 1, (Dish.values().length - 1))];
    }
}
