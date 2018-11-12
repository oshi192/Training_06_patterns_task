package ex10;

public class Projector implements DVI {
    @Override
    public String dviMessage(String message) {
        return "DVI("+message+")";
    }
}
