package com.wz.creational.factorymethod;

/**
 * @author 隔壁老王
 * @create 2020-04-27 17:17
 * @description
 */
//具体产品实现：牛
public class Cattle implements Animal {

    @Override
    public void show() {
        System.out.println("牛在畜牛厂中");
    }
}