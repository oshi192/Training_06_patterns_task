package ex10;

public class AdapterToDVI extends PC implements DVI{
    public String dviMessage(String message){
        return "DVI("+this.svgaMessage(message)+")";
    }

    public void printMessage(String message){
        this.dviMessage(message);
    }
}
