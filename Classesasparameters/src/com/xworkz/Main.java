package com.xworkz;

import com.xworkz.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Display display = new Display();
        Shop shop= new Shop();

        shop.ads(display);

        System.out.println("--------------------------");

        Poster poster = new Poster();
        Theater theater = new Theater();

        theater.show(poster);

        System.out.println("--------------------------");

        Rcb rcb = new Rcb();
        Cricket cricket = new Cricket();

        cricket.run(rcb);

        System.out.println("--------------------------");

        Space space = new Space();
        Nasa nasa = new Nasa();

        nasa.research(space);

        System.out.println("--------------------------");

        Rocket rocket =new Rocket();
        Fuel fuel = new Fuel();

        fuel.burn(rocket);

        System.out.println("--------------------------");

        Dolo dolo =new Dolo();
        Fever fever =new Fever();

        fever.takeTablet(dolo);

        System.out.println("--------------------------");

        Barber barber = new Barber();
        Customer customer = new Customer();

        customer.getHaircut(barber);

        System.out.println("--------------------------");

        Camera camera = new Camera();
        Lens lens = new Lens();

        lens.clearLens(camera);

        System.out.println("--------------------------");

        Mango mango = new Mango();
        Tree tree = new Tree();

        tree.grow(mango);

        System.out.println("--------------------------");

        Pillow pillow = new Pillow();
        Sleep sleep =new Sleep();

        sleep.relax(pillow);
    }
}