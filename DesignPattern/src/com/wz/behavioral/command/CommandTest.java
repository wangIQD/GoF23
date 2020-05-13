package com.wz.behavioral.command;

/**
 * @author 隔壁老王
 * @create 2020-05-08 15:01
 * @description
 */
//测试类
public class CommandTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        CommandImpl command = new CommandImpl(employee);
        Boss boss = new Boss(command);
        boss.call();
    }
}
