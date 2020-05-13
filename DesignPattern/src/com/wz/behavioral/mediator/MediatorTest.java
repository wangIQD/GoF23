package com.wz.behavioral.mediator;

/**
 * @author 隔壁老王
 * @create 2020-05-08 18:15
 * @description
 */
//测试类
public class MediatorTest {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();
        Colleague colleague1 = new ColleagueImpl();
        mediator.register(colleague1);
        colleague1.send();
    }
}
