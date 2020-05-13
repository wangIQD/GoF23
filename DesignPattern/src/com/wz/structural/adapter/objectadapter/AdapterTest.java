package com.wz.structural.adapter.objectadapter;

/**
 * @author 隔壁老王
 * @create 2020-05-01 15:45
 * @description
 */
//测试类
public class AdapterTest {
    public static void main(String[] args) {
        Input input = new Input();
        Output Output = new Adapter(input);
        Output.output();
    }
}
