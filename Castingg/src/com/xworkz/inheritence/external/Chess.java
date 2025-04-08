package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Game;

public class Chess extends Game {

    public Chess(){
      super();
        System.out.println("no-argu const in running in Chess");
    }
    @Override
    public void  start(){
        System.out.println("Running method in Chess");
    }
    @Override
    public void  pause(){
        System.out.println("Running method in Chess");
    }
    @Override
    public void  end() {
        System.out.println("Running method in Chess");
    }
    @Override
    public void  reset(){
        System.out.println("Running method in Chess");
    }
    @Override
    public void saveProgress(){
        System.out.println("Running method in Chess");
    }
    public void restart(){
        System.out.println("Running method in Chess");
    }
}
