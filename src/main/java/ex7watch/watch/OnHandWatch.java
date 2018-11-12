package ex7Watch.watch;

import java.util.Date;

public class OnHandWatch implements Watch {
    public void showTime() {
        System.out.println("The watch on your hand, time: " + new Date().toString());
    }
}
