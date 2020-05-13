package com.wz.structural.composite.transparent;

/**
 * @author 隔壁老王
 * @create 2020-05-03 11:28
 * @description
 */
//模拟杀毒软件扫描文件的场景：使用透明方式
//抽象构建角色：抽象文件类
public abstract class AbstractFile {
    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile getChild(int i);
    public abstract void killVirus();
}
