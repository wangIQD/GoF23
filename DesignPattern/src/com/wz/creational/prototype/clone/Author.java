package com.wz.creational.prototype.clone;

/**
 * @author 隔壁老王
 * @create 2020-04-29 17:46
 * @description
 */
public class Author implements Cloneable {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
