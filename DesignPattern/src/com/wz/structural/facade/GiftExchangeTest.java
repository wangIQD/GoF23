package com.wz.structural.facade;

/**
 * @author 隔壁老王
 * @create 2020-04-29 19:38
 * @description
 */
//测试类
public class GiftExchangeTest {
    public static void main(String[] args) {
        Gift gift = new Gift("外星人（alienware）全新Aurora R9");
        GiftExchange giftExchange = new GiftExchange();
        giftExchange.giftExchange(gift);
    }
}
