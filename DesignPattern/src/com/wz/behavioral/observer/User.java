package com.wz.behavioral.observer;

/**
 * @author 隔壁老王
 * @create 2020-05-07 18:15
 * @description
 */
//具体观察者：得到目标的更改通知时更新自身的状态。
public class User implements Observer {

    private String name;

    public User(String name) {
        this.name = name;
    }

    //实际业务场景中当并发量高时可能会使用到消息队列
    @Override
    public void update(String message) {
        System.out.println(name + " 收到推送消息： " + message);
    }
}
