package com.wz.structural.adapter.classadapter;

/**
 * @author 隔壁老王
 * @create 2020-05-01 15:44
 * @bilibili https://space.bilibili.com/320299990
 * @description
 */
//适配器类：将220v电流转化为20v，3.25A的电流
public class Adapter extends Input implements Output {

    @Override
    public void output() {
        super.input();
        System.out.println("将220v的电流转化为20v，3.25A的电流");
        System.out.println("输出20v，3.25A的电流");
    }
}
