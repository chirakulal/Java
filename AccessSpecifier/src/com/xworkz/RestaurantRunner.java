package com.xworkz;

import com.xworkz.external.Celebration;
import com.xworkz.internal.Restaurant;
import com.xworkz.internal.TeamMeet;

public class RestaurantRunner {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        TeamMeet teamMeet = new TeamMeet(restaurant);
        teamMeet.display();

        Celebration celebration= new Celebration(restaurant);
        celebration.details();

    }
}
