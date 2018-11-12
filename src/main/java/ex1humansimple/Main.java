package ex1HumanSimple;

import ex1HumanSimple.states.HeFishman;

public class Main {
    public static void main(String[] args) {
        Human human= new Human();
        human.setState(new HeFishman());

        for (int i = 0; i <5 ; i++) {
            human.changeState();
            human.doStateActivity();
        }
    }
}
