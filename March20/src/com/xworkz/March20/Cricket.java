package com.xworkz.March20;

public class Cricket {

   Ticket ticket;

   Cricket(Ticket ticket){
       this.ticket =ticket;
       System.out.println("the ticket in cricket is " + this.ticket);
   }
     void watch( ){

         System.out.println("running watch in Cricket class");
         if(ticket!=null){
             ticket.buy();
         }
         else System.out.println("reference is pointing to null");
     }
   void profit(){
       System.out.println("running profit in Cricket class");
       if(ticket!=null){
           ticket.sell();
       }
       else System.out.println("reference is pointing to null");
   }

}
