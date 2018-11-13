package ex5salad.model;

import ex5salad.view.View;

import java.util.ArrayList;
import java.util.List;

public class Salad {
    private Dish dish = Dish.NONE;
    private Flavouring flavouring = Flavouring.NONE;
    private List<Ingredient> ingredients = new ArrayList<>();
    private Spice spice = Spice.NONE;

    public String missedComponents() {
        StringBuilder components = new StringBuilder();
        components.append(ingredients.size() == 0 ? View.INGREDIENTS + View.SPACE : "");
        components.append(dish == Dish.NONE ? View.DISH : "");
        components.append(flavouring == Flavouring.NONE ? View.FLAVOURING : "");
        components.append(spice == Spice.NONE ? View.SPICE : "");
        return components.toString();
    }

    public String components() {
        StringBuilder components = new StringBuilder();
        components.append(View.INGREDIENTS+ View.DOTS);
        for (Ingredient ingredient : ingredients) {
            components.append(ingredient.name() + View.SPACE);
        }
        components.append(View.NEWLINE);
        components.append(View.SPICE + View.DOTS);
        components.append(spice.name());
        components.append(View.NEWLINE);
        components.append(View.FLAVOURING + View.DOTS);
        components.append(flavouring.name());
        components.append(View.NEWLINE);
        components.append(View.DISH + View.DOTS);
        components.append(dish.name());
        components.append(View.NEWLINE);
        return components.toString();
    }

    public void setFlavouring(Flavouring flavouring) {
        this.flavouring = flavouring;
    }

    public void setSpice(Spice spice) {
        this.spice = spice;
    }

    public void addIngridient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Dish getDish() {
        return dish;
    }

    public Flavouring getFlavouring() {
        return flavouring;
    }

    public List<Ingredient> getIngridients() {
        return ingredients;
    }

    public Spice getSpice() {
        return spice;
    }
}
