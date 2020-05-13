package com.wz.creational.abstractfactory;

/**
 * @author 隔壁老王
 * @create 2020-04-28 16:44
 * @description
 */
public class PythonCourseFactory implements CourseFactory {

    @Override
    public Video createVideo() {
        System.out.println("录制Python课程视频");
        return new PythonVideo();
    }

    @Override
    public Note createNote() {
        System.out.println("编写Python课程笔记");
        return new PythonNote();
    }
}
