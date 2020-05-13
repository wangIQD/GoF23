package com.wz.behavioral.iterator;

/**
 * @author 隔壁老王
 * @create 2020-05-05 16:25
 * @description
 */
//清华大学设有20学院，对其进行迭代。
//抽象聚合角色
public interface CollegeAggregate {
    void addCollege(College college);
    void removeCollege(College college);
    CollegeIterator getIterator();
}
