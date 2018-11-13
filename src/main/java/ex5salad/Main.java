package ex5salad;

import ex5salad.controller.Controller;
import ex5salad.model.Salad;
import ex5salad.view.View;

public class Main {
    public static void main(String[] args) {
        Controller saladCreator = new Controller(new Salad(),new View());
        saladCreator.createSalad();
    }
}
