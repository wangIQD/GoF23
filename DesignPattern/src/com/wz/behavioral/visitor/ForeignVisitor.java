package com.wz.behavioral.visitor;

/**
 * @author 隔壁老王
 * @create 2020-05-09 21:04
 * @description
 */
//具体访问者：外国游客
public class ForeignVisitor implements Visitor {

    @Override
    public void visit(Mural mural) {
        System.out.println("外国游客参观了" + mural.getName());
    }

    @Override
    public void visit(JadeArticle jadeArticle) {
        System.out.println("外国游没有参观" + jadeArticle.getName());
    }
}
