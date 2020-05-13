package com.wz.structural.proxy.dynamicproxy;

/**
 * @author 隔壁老王
 * @create 2020-05-04 15:48
 * @description
 */
//真实角色：房东
public class Landlord implements Rent {

    @Override
    public void Renting() {
        System.out.println("房东租房");
    }
}
