package ex11pcrealisation;

public class PCManager {
    PC pc;

    PCManager() {
        pc = new PC();
    }

    public void turnOnPc() throws InterruptedException {
        pc.startButton(false);
        pc.loadBIOS();
        pc.checkComponents();
        pc.startUpOS();
        pc.greetingsWindov();
        pc.readPassword();
    }
}
