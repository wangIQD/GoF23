package com.wz.structural.decorate.example;

/**
 * @author 隔壁老王
 * @create 2020-04-30 18:05
 * @description
 */
//具体构建角色（被装饰类）：蛋糕
public class Cake extends AbstractCake {

    @Override
    public String description() {
        return "蛋糕";
    }

    @Override
    public int calculatePrice() {
        return 15;
    }

}
