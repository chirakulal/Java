package com.xworkz.internal;

public class Alien {
    private String seen;
    private String seendate;
    private String describe;


    public Alien(){
        System.out.println("Running no-argu const");
    }

    public String getSeen(){
        return  this.seen;
    }
    public String getSeendate(){
        return this.seendate;
    }
    public String getDescribe(){
        return this.describe;
    }
    public void setSeen(String seen){
        this.seen=seen;
    }
    public  void setSeendate(String seendate){
        this.seendate=seendate;
    }
    public void setDescribe(String describe){
        this.describe=describe;
    }
}
