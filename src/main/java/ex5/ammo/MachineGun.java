package ex5.ammo;

import ex5.amunition.Ammo;

public class MachineGun extends Weapon {

    MachineGun(Ammo amunition) {
        super(amunition);
    }

    boolean chackState() {
        return false;
    }
}
