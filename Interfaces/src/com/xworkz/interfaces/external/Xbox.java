package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Gaming;

public class Xbox implements Gaming {

    @Override
    public void startGame() {
        System.out.println("Running startGame in Xbox");
    }

    @Override
    public void pauseGame() {
        System.out.println("Running pauseGame in Xbox");
    }

    @Override
    public void endGame() {
        System.out.println("Running endGame in Xbox");
    }
}
