package com.wz.behavioral.mediator;

/**
 * @author 隔壁老王
 * @create 2020-05-08 18:03
 * @description
 */
//具体同事类
class ColleagueImpl extends Colleague {

    @Override
    public void receive() {
        System.out.println("具体同事类收到消息。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类发出消息。");
        mediator.relay(this); //请中介者转发
    }
}