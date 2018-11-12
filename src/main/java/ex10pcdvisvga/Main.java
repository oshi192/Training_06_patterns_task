package ex10;

public class Main {
    public static void main(String[] args) {
        DVI signalToProjector = new AdapterToDVI();
        System.out.println(signalToProjector.dviMessage("some video or image message"));
    }
}
