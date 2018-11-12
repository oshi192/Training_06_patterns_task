package ex10;

public class PC implements SVGA {

    @Override
    public String svgaMessage(String message) {
        return "SVGA("+message+")";
    }
}
