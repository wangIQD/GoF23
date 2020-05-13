package com.wz.structural.bridge;

/**
 * @author 隔壁老王
 * @create 2020-05-03 16:17
 * @description
 */
//具体实现化角色：定期存款的账户
public class DepositAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开一个定期存款的账户");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
