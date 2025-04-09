package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Sword;
import com.xworkz.inheritence.internal.Weapon;

public class Knife {
    public void cut(Weapon weapon){
        weapon.storeSafely();
        weapon.equip();
        weapon.defend();
        weapon.sharpen();
        weapon.attack();
        if(weapon instanceof Sword){
            Sword sword =(Sword) weapon;
            sword.sharp();
        }
    }
}
