package com.wz.creational.prototype.clone;

/**
 * @author 隔壁老王
 * @create 2020-04-29 16:13
 * @bilibili https://space.bilibili.com/320299990
 * @description
 */
//业务场景：隔壁老王出了一本《隔壁老王带你学Java》的书，现印刷厂在加紧印制。将此场景模拟成原型模式。
//假设这是一个new一个对象非常繁琐的过程
//具体原型类
public class Book implements Cloneable {

    private Author author;
    private String name;

    public Book(Author author, String name) {
        this.author = author;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book book = (Book)super.clone();
        book.author = (Author) book.author.clone();
        return book;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", name='" + name + '\'' +
                '}' + super.toString();
    }
}
