package com.wz.behavioral.command;

/**
 * @author 隔壁老王
 * @create 2020-05-08 14:57
 * @description
 */
//请求者角色：公司Boss
public class Boss {
    private Command command;

    public Boss(Command command) {
        this.command = command;
    }

    public void call(){
        System.out.println("请求者执行命令command...");
        command.execute();
    }
}
