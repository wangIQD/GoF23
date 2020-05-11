package com.wz.structural.composite.safe;

/**
 * @author 隔壁老王
 * @create 2020-05-03 11:28
 * @bilibili https://space.bilibili.com/320299990
 * @description
 */
//对文件（文件夹）进行遍历
//抽象构建角色：抽象文件类
public abstract class AbstractFile {

    private String name;

    public AbstractFile(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println(this.name);
    };
}
