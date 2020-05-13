package com.wz.structural.composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 隔壁老王
 * @create 2020-05-03 12:02
 * @description
 */
//树枝构件角色：文件夹类
public class Folder extends AbstractFile {

    //定义集合fileList，用于存储AbstractFile类型的成员
    private ArrayList<AbstractFile> fileList = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void add(AbstractFile file) {
        fileList.add(file);
    }

    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    public List<AbstractFile> getChild() {
        return fileList;
    }

}
