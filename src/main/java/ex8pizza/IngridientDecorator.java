package ex8pizza;

public class IngridientDecorator implements Ingridient {
    private Ingridient ingridient;
    private int prise;
    private String name;
    private double profit;

    public IngridientDecorator(PizzaPart part, Ingridient ingridient) {
        this.ingridient = ingridient;
        this.name = part.name();
        this.prise = part.prise;
        this.profit = part.profit;
    }

    @Override
    public int calculatePrise() {
        return ingridient.calculatePrise() + prise;
    }

    public String components() {
        return name + "\t" + prise + "\n" + ingridient.components();
    }

    public double calculateProfit(){
        return prise*profit+ingridient.calculateProfit();
    }
}
