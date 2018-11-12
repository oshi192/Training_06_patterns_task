package ex1HumanSimple;

import ex1HumanSimple.states.*;

public class Human {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void changeState() {
        if (state instanceof HeFishman){
            state = new HeHunter();
        }else if(state instanceof HeHunter){
            state = new HeMushroomPicker();
        }else {
            state = new HeFishman();
        }
    }

    public void doStateActivity(){
        state.doStateActivity();
    }
}
