package com.wz.behavioral.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 隔壁老王
 * @create 2020-05-09 22:48
 * @description
 */
//对象结构角色
public class MuseumObjectStructure {
    private List<Museum> lists = new ArrayList();

    public void accept(Visitor visitor) {
        Iterator<Museum> i = lists.iterator();
        while(i.hasNext()) {
            ((Museum) i.next()).accept(visitor);
        }
    }

    public void add(Museum museum) {
        lists.add(museum);
    }

    public void remove(Museum museum) {
        lists.remove(museum);
    }
}
