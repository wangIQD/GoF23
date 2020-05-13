package com.wz.behavioral.strategy;

/**
 * @author 隔壁老王
 * @create 2020-05-05 18:37
 * @description
 */
//策略上下文类
public class RoleContext {

    private Role role;

    public RoleContext(Role role) {
        this.role = role;
    }

    public String execute(){
        return role.authority();
    }
}
