package com.wz.behavioral.visitor;

/**
 * @author 隔壁老王
 * @create 2020-05-09 20:42
 * @description
 */
//抽象访问者：游客
public interface Visitor {
    void visit(Mural mural);
    void visit(JadeArticle jadeArticle);
}
