package com.wz.creational.prototype.abstractprototype;

/**
 * @author 隔壁老王
 * @create 2020-04-29 17:11
 * @description
 */
public class B extends A {
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        Object clone = b.clone();
    }
}
