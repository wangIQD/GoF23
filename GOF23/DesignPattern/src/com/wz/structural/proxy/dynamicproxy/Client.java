package com.wz.structural.proxy.dynamicproxy;

/**
 * @author 隔壁老王
 * @create 2020-05-04 15:58
 * @bilibili https://space.bilibili.com/320299990
 * @description
 */
//客户端：测试类
public class Client {
    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        DynamicProxy dynamicProxy = new DynamicProxy();
        dynamicProxy.setTarget(landlord);
        Rent rent = (Rent) dynamicProxy.getProxy();
        rent.Renting();
    }
}
