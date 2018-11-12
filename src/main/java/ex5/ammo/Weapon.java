package ex5.ammo;

import ex5.amunition.Ammo;

public abstract class Weapon {
    Ammo amunition;

    Weapon(Ammo amunition) {
        this.amunition = amunition;
    }

    boolean chackState(){
        return true;
    }
}
