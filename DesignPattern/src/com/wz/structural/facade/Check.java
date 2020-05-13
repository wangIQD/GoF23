package com.wz.structural.facade;

/**
 * @author 隔壁老王
 * @create 2020-04-29 19:13
 * @description
 */
//资格校验
public class Check {
    public boolean isAvailable(Gift gift){
        System.out.println("进行 "+gift.getName()+" 积分校验,积分足够");
        return true;
    }
}
