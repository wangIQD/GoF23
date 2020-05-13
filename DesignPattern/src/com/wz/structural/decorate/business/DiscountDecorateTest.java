package com.wz.structural.decorate.business;

/**
 * @author 隔壁老王
 * @create 2020-04-30 19:00
 * @description
 */
public class DiscountDecorateTest {
    public static void main(String[] args) {
        BasicDiscount basicDiscount;
        basicDiscount = new VIPDiscount();
        VIPDiscountDecorate vipDiscountDecorate;
        vipDiscountDecorate = new VIPDiscountDecorate(basicDiscount);
        vipDiscountDecorate.discount();
        vipDiscountDecorate.expandBusiness();
    }
}
