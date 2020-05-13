package com.wz.creational.prototype.abstractprototype;

/**
 * @author 隔壁老王
 * @create 2020-04-29 17:10
 * @description
 */
public abstract class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
