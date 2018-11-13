package ex5salad.view;

public class View {
    public static final String ANSWER = "answer: number or 'Enter' button ";
    public static final String INGREDIENTS_CHOOSE = "Choose Ingredients for salad:";
    public static final String INGREDIENTS = "Ingredients";
    public static final String FLAVOURING_CHOOSE = "Choose Flavouring for salad:";
    public static final String FLAVOURING = "Flavoring";
    public static final String SPICE_CHOOSE = "Choose Spice for salad:";
    public static final String SPICE = "Spice";
    public static final String DISH_CHOOSE = "Choose Dish for salad:";
    public static final String DISH = "Dish";
    public static final String ERROR_CANNT_CREATE = "can't create salad, some component is missed: ";
    public static final String DOTS = ": ";
    public static final String NEWLINE = "\n";
    public static final String SPACE = " ";

    public void print(String message){
        System.out.println(message);
    }
}
