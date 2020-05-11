package com.wz.structural.facade;

/**
 * @author 隔壁老王
 * @create 2020-04-29 19:02
 * @bilibili https://space.bilibili.com/320299990
 * @description
 */
//业务场景：隔壁老王制作了自己的教育网站，你可以通过注册此网站，在此网站内购买课程，为别人解答问题等。
//通过这些操作你能够获得相应的积分，在此网站中你可以通过积分兑换实体礼物。
//兑换实体礼物需要你进行资格校验（积分是否足够等）、然后积分支付、最后物流对接。
//上面的三个模块可以看成子系统，对外我们只需要封装一个礼物兑换的外观类即可。
//此处只是为了演示设计模式，程序中没有太多的逻辑

//礼物
public class Gift {
    private String name;

    public Gift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
