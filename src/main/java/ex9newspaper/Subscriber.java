package ex9newspaper;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void handleEvent(String newsPaper) {
        System.out.println("Dear " + name + "! we sent you new newspaper:\t" + newsPaper);
    }
}