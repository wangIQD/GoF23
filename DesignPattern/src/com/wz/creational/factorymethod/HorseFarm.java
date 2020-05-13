package com.wz.creational.factorymethod;

/**
 * @author 隔壁老王
 * @create 2020-04-27 17:19
 * @description
 */
//工厂实现：畜马厂
public class HorseFarm implements AnimalFarm {
    @Override
    public Animal newAnimal() {
        System.out.println("新马出生");
        return new Horse();
    }
}
