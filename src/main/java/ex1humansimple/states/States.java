package ex1HumanSimple.states;

public enum States {
    FISHMAN(new HeFishman()),
    HUNTER(new HeHunter()),
    MUSHROOMPICKER(new HeMushroomPicker());

    public final State state;

    States (State state){
        this.state = state;
    }
}
