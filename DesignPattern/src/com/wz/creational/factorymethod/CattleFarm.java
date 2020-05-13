package com.wz.creational.factorymethod;

/**
 * @author 隔壁老王
 * @create 2020-04-27 17:57
 * @description
 */
//工厂实现：畜牛厂
public class CattleFarm implements AnimalFarm {
    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生");
        return new Cattle();
    }
}
