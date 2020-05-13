package com.wz.creational.prototype;

/**
 * @author 隔壁老王
 * @create 2020-04-29 16:22
 * @description
 */
//印刷工厂：客户端
public class Printing {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book("《隔壁老王带你学Java》");
        System.out.println("初始化的书：" + book);
        for(int i = 1; i <= 10; i++){
            System.out.println("印刷第" + i + "本书");
            Object clone = book.clone();
            System.out.println(clone);
        }
    }
}
