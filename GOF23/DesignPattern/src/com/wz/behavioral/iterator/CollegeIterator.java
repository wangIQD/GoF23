package com.wz.behavioral.iterator;

/**
 * @author 隔壁老王
 * @create 2020-05-05 16:32
 * @bilibili https://space.bilibili.com/320299990
 * @description
 */
//抽象迭代器角色
public interface CollegeIterator {
    College nextCollege();
    boolean hasNextCollege();
}
