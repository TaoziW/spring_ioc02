package com.shentao.spring.ioc.class001;

public class Audi implements Car {

    public void start(){
        System.out.println("Audi.start");
    }


    public void turnLeft(){
        System.out.println("Audi.turnLeft");
    }

    public void turnRight(){
        System.out.println("Audi.turnLeft");
    }

    public void stop(){
        System.out.println("Audi.turnLeft");
    }

}
