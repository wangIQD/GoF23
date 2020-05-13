package com.wz.structural.proxy.dynamicproxy;

/**
 * @author 隔壁老王
 * @create 2020-05-04 15:42
 * @description
 */
//最常用的例子：生活中房东要出租房屋，你想要租房，但你无法见到房东，你只能去找中介。
//此时抽象角色即为租房，房东为真实角色，中介为代理角色。
//抽象角色：租房的接口
public interface Rent {
    void Renting();
}
