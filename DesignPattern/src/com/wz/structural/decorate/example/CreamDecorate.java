package com.wz.structural.decorate.example;

/**
 * @author 隔壁老王
 * @create 2020-04-30 18:11
 * @description
 */
//具体装饰类：奶油装饰类
public class CreamDecorate extends AbstractDecorate {

    public CreamDecorate(AbstractCake abstractCake) {
        super(abstractCake);
    }

    @Override
    public String description() {
        return super.description() + " 涂抹上奶油";
    }

    @Override
    public int calculatePrice() {
        return super.calculatePrice() + 15;
    }

}
