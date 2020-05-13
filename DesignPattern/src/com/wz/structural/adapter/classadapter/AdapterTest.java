package com.wz.structural.adapter.classadapter;

/**
 * @author 隔壁老王
 * @create 2020-05-01 15:45
 * @description
 */
//测试类
public class AdapterTest {
    public static void main(String[] args) {
        //调用目标接口的实现类
        Output Output = new Adapter();
        Output.output();
    }
}
