package com.wz.behavioral.visitor;

/**
 * @author 隔壁老王
 * @create 2020-05-09 20:34
 * @description
 */
//业务场景：游客访问博物馆
//抽象元素角色：博物馆
public interface Museum {
    void accept(Visitor visitor);
}
