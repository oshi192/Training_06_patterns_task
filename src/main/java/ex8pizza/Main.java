package ex8pizza;

public class Main {
    public static void main(String[] args) {
        Ingridient pizza = new IngridientDecorator(PizzaPart.TOMATO,
                new IngridientDecorator(PizzaPart.CHICKEN,
                        new IngridientDecorator(PizzaPart.CHEESE,
                                new IngridientDecorator(PizzaPart.CHEESE,
                                        new IngridientDecorator(PizzaPart.OLIVE,
                                                new PizzaBase(200, 0.1)))))
        );

        System.out.println(pizza.components());
        System.out.println("\ntotal prise:\t" + pizza.calculatePrise() / 100.0);
        System.out.println("profit:\t"+pizza.calculateProfit()/100);
    }
}
