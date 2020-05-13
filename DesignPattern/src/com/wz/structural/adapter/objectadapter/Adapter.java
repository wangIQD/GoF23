package com.wz.structural.adapter.objectadapter;

/**
 * @author 隔壁老王
 * @create 2020-05-01 15:44
 * @description
 */
//适配器类：将220v电流转化为20v，3.25A的电流
public class Adapter implements Output {

    private Input input;

    public Adapter(Input input) {
        this.input = input;
    }

    @Override
    public void output() {
        input.input();
        System.out.println("将220v的电流转化为20v，3.25A的电流");
        System.out.println("输出20v，3.25A的电流");
    }
}
