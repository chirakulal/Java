package com.xworkz.external;

import com.xworkz.internal.Jail;

public class Criminals {

    public Criminals(){
        System.out.println("no-argu const running criminal");
    }

    public void Kill(Jail[] jail){
        System.out.println("Running kill in Criminal");
        if(jail!=null){
            for(Jail ref: jail){
                System.out.println(ref.getName());
                System.out.println(ref.getJailerName());
                System.out.println(ref.getLocation());
                System.out.println(ref.getTotalCells());
            }
        }
    }
    public void thives(Jail jail){
        System.out.println("Running thives in Criminal");
        if(jail!=null){
            System.out.println(jail.getName());
            System.out.println(jail.getLocation());
            System.out.println(jail.getJailerName());
            System.out.println(jail.getTotalCells());
        }
    }

    public void corruption(){
        System.out.println("Running corruption in Criminal");
        Jail jail = new Jail();
        jail.setName("MCD");
        jail.setLocation("Mysuru");
        jail.setJailerName("Tina");
        jail.setTotalCells(50);

        System.out.println(jail.getJailerName());
        System.out.println(jail.getName());
        System.out.println(jail.getLocation());
        System.out.println(jail.getTotalCells());
    }



    public  void murder(){
        System.out.println("Running murder in Criminal");
        Jail jail1 = new Jail();
        jail1.setJailerName("SV");
        jail1.setLocation("Bengaluru");
        jail1.setJailerName("Rampa");
        jail1.setTotalCells(100);

        Jail jail2 = new Jail();
        jail2.setJailerName("SV");
        jail2.setLocation("Bengaluru");
        jail2.setJailerName("Rampa");
        jail2.setTotalCells(100);

        Jail[] jails ={ jail1,jail2};


        for (Jail ref : jails) {
            System.out.println(ref.getName());
            System.out.println(ref.getLocation());
            System.out.println(ref.getJailerName());
            System.out.println(ref.getTotalCells());
        }
    }


}
