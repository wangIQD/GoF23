package com.wz.creational.factorymethod;

/**
 * @author 隔壁老王
 * @create 2020-04-27 17:15
 * @description
 */
//具体产品实现：马
public class Horse implements Animal {

    @Override
    public void show() {
        System.out.println("马在畜马厂中");
    }
}
