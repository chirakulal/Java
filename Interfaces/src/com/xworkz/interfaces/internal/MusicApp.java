package com.xworkz.interfaces.internal;

public interface MusicApp {

    void playSong();
    void pauseSong();
    void downloadSong();

     default  void addToLibrary(){
         System.out.println("Running addToLibrary in MUsicApp");
     }
}
