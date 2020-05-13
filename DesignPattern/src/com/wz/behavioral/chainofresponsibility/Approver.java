package com.wz.behavioral.chainofresponsibility;

/**
 * @author 隔壁老王
 * @create 2020-05-08 20:11
 * @description
 */
//抽象处理者角色：审批者
public abstract class Approver {

    protected Approver approver;

    public void setNextApprover(Approver approver){
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
