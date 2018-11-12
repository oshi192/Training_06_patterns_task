package ex8pizza;

public class PizzaBase implements Ingridient {
    private int prise;
    private double profit;

    public PizzaBase(int prise,double profit) {
        this.prise = prise;
    }

    @Override
    public int calculatePrise() {
        return prise;
    }

    @Override
    public String components() {
        return "Pizza Base: \t" + prise;
    }

    @Override
    public double calculateProfit() {
        return prise*profit;
    }
}
