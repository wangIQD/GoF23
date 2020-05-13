package com.wz.structural.decorate.example;

/**
 * @author 隔壁老王
 * @create 2020-04-30 18:28
 * @description
 */
public class CakeDecorateTest {
    public static void main(String[] args) {
        AbstractCake abstractCake = new Cake();
        abstractCake = new CreamDecorate(abstractCake);
        abstractCake = new StrawberryDecorate(abstractCake);

        System.out.println(abstractCake.description() + "，价格为：" + abstractCake.calculatePrice());
    }
}
