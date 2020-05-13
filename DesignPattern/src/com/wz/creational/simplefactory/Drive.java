package com.wz.creational.simplefactory;

/**
 * @author 隔壁老王
 * @create 2020-04-26 17:48
 * @description
 */
public class Drive {
    public static void main(String[] args) {
        // 未使用简单工厂
        Audi audi = new Audi();
        audi.run();
        Byd byd = new Byd();
        byd.run();

//        // 使用简单工厂
//        Car car = CarFactory.createCar("奥迪");
//        // 防止空指针异常
//        if (car == null){
//            return;
//        }
//        car.run();

        Car car = CarFactory.createCar(Audi.class);
        if (car == null){
            return;
        }
        car.run();
    }
}
