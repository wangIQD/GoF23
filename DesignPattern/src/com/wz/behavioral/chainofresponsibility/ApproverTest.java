package com.wz.behavioral.chainofresponsibility;

/**
 * @author 隔壁老王
 * @create 2020-05-08 20:29
 * @description
 */
//客户端
public class ApproverTest {
    public static void main(String[] args) {
        NoteApprover noteApprover = new NoteApprover();
        VideoApprover videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("SpringCloud Alibaba微服务架构");
        course.setNote("SpringCloud Alibaba微服务架构的笔记");
        course.setVideo("SpringCloud Alibaba微服务架构的视频");

        noteApprover.setNextApprover(videoApprover);

        noteApprover.deploy(course);
    }
}
