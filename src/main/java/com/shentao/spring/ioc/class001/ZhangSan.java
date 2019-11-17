package com.shentao.spring.ioc.class001;

public class ZhangSan {

    private Car car;

    public ZhangSan(Car car) {
        this.car = car;
    }

    public void goHome(){

        car.start();
        car.turnRight();
        car.turnLeft();
        car.stop();

    }

    public void goShop(){

        car.start();
        car.turnRight();
        car.turnLeft();
        car.stop();
    }

    public static void main(String[] args){
        ZhangSan zhangSan = new ZhangSan(new Buick());
        zhangSan.goHome();
        zhangSan.goShop();
    }

}
