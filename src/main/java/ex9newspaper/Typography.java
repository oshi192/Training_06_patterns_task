package ex9newspaper;

import java.util.ArrayList;
import java.util.List;

public class Typography implements Observed {
    String newsPaper;
    List<Observer> subscribers = new ArrayList<>();

    public void addVaconcy(String newsPaper) {
        this.newsPaper = newsPaper;
        notifyObsorvers();
    }

    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    public void notifyObsorvers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(this.newsPaper);
        }
    }
}
