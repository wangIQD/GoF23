package com.wz.structural.facade;

/**
 * @author 隔壁老王
 * @create 2020-04-29 19:18
 * @description
 */
//积分支付
public class PointPayment {
    public boolean pay(Gift gift){
        System.out.println("支付 "+gift.getName()+" 的积分成功");
        return true;
    }
}
