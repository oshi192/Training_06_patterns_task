package ex8pizza;

public enum PizzaPart {
    TOMATO(540,0.8),
    CHEESE(300,0.4),
    OLIVE(600,0.3),
    CHICKEN(620,0.6),
    MUSHROOMS(480,0.35);

    public final int prise;
    public final double profit;

    PizzaPart(int prise, double profit) {
        this.prise = prise;
        this.profit = profit;
    }
}
