package ex7Watch.watch;

import java.util.Date;

public class OnFloorWatch implements Watch{
    public void showTime() {
        System.out.println("The watch on floor, time: " + new Date().toString());
    }
}
