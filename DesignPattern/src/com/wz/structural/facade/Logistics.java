package com.wz.structural.facade;

/**
 * @author 隔壁老王
 * @create 2020-04-29 19:21
 * @description
 */
//物流系统
public class Logistics {
    public String shipGift(Gift gift){
        System.out.println(gift.getName()+" 进入物流系统");
        String orderID = "123456789";
        return orderID;
    }
}
