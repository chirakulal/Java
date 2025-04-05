package com.xworkz.March20;

public class Virat {

   Ticket ticket;
    Brush brush;
    Clip[] clip;
    Cricket cricket;
   Virat(Ticket ticket,Brush brush,Clip[] clip,Cricket cricket){
       this.ticket=ticket;
       this.brush=brush;
       this.clip=clip;
       this.cricket=cricket;

       System.out.println(this.ticket);
   }
    void play(){
        System.out.println("running play in Virat class");
        if(this.cricket!=null){
           this.cricket.watch();
            this.cricket.profit();
        }
        else System.out.println("reference is pointing to null");
    }

    void clean(){
        System.out.println("running clean in Virat class");
        if(brush!=null){
            brush.clean();
            brush.scrub();
        }
        else System.out.println("reference is pointing to null");
    }
    void relax(){
        System.out.println("running relax in Virat class");
        if(ticket!=null){
            ticket.sell();
            ticket.buy();
        }else System.out.println("reference is pointing to null");
    }

    void style(){
        System.out.println("running style");
        if(clip!=null) {
            for (Clip ref : clip) {
                ref.hold();
            }
        }
    }
}
