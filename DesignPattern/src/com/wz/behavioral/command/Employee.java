package com.wz.behavioral.command;

/**
 * @author 隔壁老王
 * @create 2020-05-08 14:55
 * @description
 */
//接受者角色：员工
public class Employee {
    public void action(){
        System.out.println("接受者action方法被调用");
        System.out.println("员工收到Boss下达的命令");
    }
}
