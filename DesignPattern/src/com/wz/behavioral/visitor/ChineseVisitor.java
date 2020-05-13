package com.wz.behavioral.visitor;

/**
 * @author 隔壁老王
 * @create 2020-05-09 20:43
 * @description
 */
//具体访问者：中国游客
public class ChineseVisitor implements Visitor {

    @Override
    public void visit(Mural mural) {
        System.out.println("中国游客参观了" + mural.getName());
    }

    @Override
    public void visit(JadeArticle jadeArticle) {
        System.out.println("中国游客参观了" + jadeArticle.getName());
    }
}
