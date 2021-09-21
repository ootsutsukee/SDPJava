package Charecter;

import Weapon.WeaponBehavior;

public abstract class Character{
    protected WeaponBehavior weapon;

    public void fight(){
        System.out.println(this.getClass());
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
