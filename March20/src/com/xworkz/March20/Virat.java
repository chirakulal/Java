package com.xworkz.March20;

public class Virat {

   Ticket ticket;
   Virat(Ticket ticket){
       this.ticket=ticket;
       System.out.println(this.ticket);
   }
    void play(Cricket cricket){
        System.out.println("running play in Virat class");
        if(cricket!=null){
            cricket.watch();
            cricket.profit();
        }
        else System.out.println("reference is pointing to null");
    }

    void clean(Brush brush){
        System.out.println("running clean in Virat class");
        if(brush!=null){
            brush.clean();
            brush.scrub();
        }
        else System.out.println("reference is pointing to null");
    }
    void relax(Ticket ticket){
        System.out.println("running relax in Virat class");
        if(ticket!=null){
            ticket.sell();
            ticket.buy();
        }else System.out.println("reference is pointing to null");
    }

    void style(Clip clip){
        System.out.println("running style");
        if(clip!=null){
            clip.hold();
        }

    }
}
