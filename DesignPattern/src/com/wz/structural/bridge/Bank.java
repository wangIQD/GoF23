package com.wz.structural.bridge;

/**
 * @author 隔壁老王
 * @create 2020-05-03 16:19
 * @description
 */
//抽象化角色：银行
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account showAccount();
}
