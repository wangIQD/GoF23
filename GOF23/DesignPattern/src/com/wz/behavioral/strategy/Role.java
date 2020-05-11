package com.wz.behavioral.strategy;

/**
 * @author 隔壁老王
 * @create 2020-05-05 18:23
 * @bilibili https://space.bilibili.com/320299990
 * @description
 */
//业务场景：现有一款后台管理系统，当用户登录时需要判断用户具有哪些权限。
//按照以往的想法：用户登录，查询数据库，返回相应角色，进行if判断，赋予相应权限。
//使用上面的写法会出现大量的 if - else if - else 语句。
//这时策略模式就可以出场了。此处是只为了演示设计模式，实际的项目那个可能有差别。
//抽象策略类：角色接口
public interface Role {
    //表示某个角色可以有什么权限
    String authority();
}
