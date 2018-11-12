package ex11pcrealisation;

import util.Reader;

import java.util.Date;

public class PC {

    public void startButton(boolean isButtonPressed) throws InterruptedException {
        System.out.println("Start button pressed?" + isButtonPressed);
        if(!isButtonPressed){
            System.out.println("Waiting .....");
            System.out.println("press 'enter' to start");
            Reader.getString();
            Thread.sleep(1000);
        }
    }

    public void loadBIOS() throws InterruptedException {
        System.out.println("Loading BIOS...\n");
        Thread.sleep(1000);
    }

    public void startUpOS() throws InterruptedException {
        System.out.print("\nStarting WindowsXP");
        for (int i = 0; i <10 ; i++) {
            System.out.print(".");
            Thread.sleep(200);
        }
        System.out.println("\ndont turn off your pc\n");
    }

    public void greetingsWindov() {
        System.out.println("User..\t\tuser");
        System.out.println("password:\t...");
    }

    public void checkComponents() throws InterruptedException {
        checkProcessor();
        memmoryTesting();
        conectedDevicesTest();
        System.out.println("Press F1 to continue, DEL to enter setup");
        System.out.println(new Date());
        Thread.sleep(1000);
    }

    private void checkProcessor(){
        System.out.println("Main processor AMD Athlon2x2 5500+");
    }
    private void memmoryTesting(){
        System.out.println("Memory testing : 2097152K OK(installed Memory: 2097152K)");
        System.out.println("Memory information: DDR 400 Dual chanel, 128-bit");
    }
    private void conectedDevicesTest(){
        System.out.println("Chipset model: AM2");
        System.out.println("Primary IDE Master: \tPLEXTOR DVDR PX-716AL, 1.02");
        System.out.println("Primary IDE Slave: \tNone");
        System.out.println("Secondary IDE Master: \tCD-W%@E 1.0E");
        System.out.println("Secondary IDE Slave: \tNone");
    }

    public void readPassword() {
        Reader.getString();
    }
}
