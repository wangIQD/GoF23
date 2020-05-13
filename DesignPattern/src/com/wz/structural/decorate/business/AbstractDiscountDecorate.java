package com.wz.structural.decorate.business;

/**
 * @author 隔壁老王
 * @create 2020-04-30 17:50
 * @description
 */
//抽象装饰角色：抽象处理业务
public abstract class AbstractDiscountDecorate extends BasicDiscount {

    private BasicDiscount basicDiscount;

    public AbstractDiscountDecorate(BasicDiscount basicDiscount) {
        this.basicDiscount = basicDiscount;
    }

    @Override
    public void discount() {
        basicDiscount.discount();
    }

    //增加扩展业务
    public abstract void expandBusiness();
}
