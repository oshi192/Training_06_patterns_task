package ex7Watch.watch;

import java.util.Date;

public class OnWallWatch implements Watch {
    public void showTime() {
        System.out.println("The watch on wall, time: " + new Date().toString());
    }
}
