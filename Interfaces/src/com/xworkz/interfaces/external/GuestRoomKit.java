package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Bedsheet;
import com.xworkz.interfaces.internal.Pillow;

public class GuestRoomKit implements Pillow, Bedsheet {

    @Override
    public void coverPillow() {
        System.out.println("Running method in GuestRoomKit");
    }

    @Override
    public void fluffPillow() {
        System.out.println("Running method in GuestRoomKit");

    }

    @Override
    public void foldSheet() {
        System.out.println("Running method in GuestRoomKit");

    }

    @Override
    public void spreadSheet() {
        System.out.println("Running method in GuestRoomKit");

    }

    @Override
    public void washPillow() {
        System.out.println("Running method in GuestRoomKit");

    }

    @Override
    public void washSheet() {
        System.out.println("Running method in GuestRoomKit");

    }
}
