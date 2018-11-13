package util;

import java.util.Scanner;

public class Reader {
    private static Scanner sc;

    private Reader() throws IllegalStateException {
        throw new IllegalStateException("Can't create instance of util.ScannerUtil");
    }

    private static Scanner getScanner() {
        if (sc == null) {
            sc = new Scanner(System.in);
        }
        return sc;
    }

    public static String getString() {
        return getScanner().nextLine();
    }


    public static int getNumber(String s, int min, int max) {
        String input;
        System.out.print(s);
        while (true) {
            input = getString();
            if (input.matches("\\d+")) {
                if (Integer.parseInt(input) >= min && Integer.parseInt(input) <= max) {
                    return Integer.parseInt(input);
                }
            }
            System.out.println("invalid input , try again. Only numbers: " + min + "-" + max);
        }
    }
    public static int getAnswer(String s, int min, int max) {
        String input;
        System.out.println(s);
        while (true) {
            input = getString();
            if(input.equals(""))return 0;
            if (input.matches("\\d+")) {
                if (Integer.parseInt(input) >= min && Integer.parseInt(input) <= max) {
                    return Integer.parseInt(input);
                }
            }
            System.out.println("invalid input , try again, numbers " + min + "-" + max+" or 'enter'");
        }
    }
}
