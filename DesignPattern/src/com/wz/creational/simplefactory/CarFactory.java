package com.wz.creational.simplefactory;

/**
 * @author 隔壁老王
 * @create 2020-04-26 17:51
 * @description
 */
public class CarFactory {
//    public static Car createCar(String type){
//        if ("奥迪".equals(type)){
//            return new Audi();
//        }else if("比亚迪".equals(type)){
//            return new Byd();
//        }
//        return null;
//    }

    public static Car createCar(Class c){
        Car car = null;
        try {
            car = (Car) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return car;
    }
}
