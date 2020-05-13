package com.wz.structural.bridge;

/**
 * @author 隔壁老王
 * @create 2020-05-03 16:12
 * @description
 */
//业务场景：中国有许多银行，ABC银行，ICBC银行。银行账户分为定期存款和活期存款。
//若是创建一个ABC银行，在创建他的两个账户。当银行很多时，岂不是会出现类爆炸（创建的类非常多）的问题
//此时就需要桥接模式。
//实现化角色：账户接口
public interface Account {
    Account openAccount();
    void showAccountType();
}
