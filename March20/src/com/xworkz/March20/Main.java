package com.xworkz.March20;

public class Main {

    public static void main(String[] args){

        Clip clip = new Clip(Color.GREEN);
        Clip clip1 = new Clip(Color.BLUE);
        Clip clip2 = new Clip(Color.RED);
        Clip clip3 = new Clip(Color.YELLOW);


        Clip[] clips = {clip,clip1,clip2,clip3};

        Pushpa pushpa = new Pushpa();
        pushpa.useClip(clips);

        System.out.println("------------------------------------------");

        Ticket ticket = new Ticket(TicketType.PREMIUM,10000);
        Cricket cricket = new Cricket(ticket);

        cricket.watch();
        cricket.profit();
        System.out.println("------------------------------------------");

        Brush brush = new Brush(Color.GREEN);

        Virat virat = new Virat(ticket,brush,clips,cricket);

        virat.play();
        virat.clean();
        virat.relax();
    }
}
