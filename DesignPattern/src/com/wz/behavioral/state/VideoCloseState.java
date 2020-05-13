package com.wz.behavioral.state;

/**
 * @author 隔壁老王
 * @create 2020-05-10 15:29
 * @description
 */
//具体状态角色：关闭状态
public class VideoCloseState extends VideoState {
    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void pause() {
        System.out.println("Error，视频正处在关闭状态，不能暂停");
    }

    @Override
    public void speed() {
        System.out.println("Error，视频正处在关闭状态，不能倍速播放");
    }

    @Override
    public void close() {
        System.out.println("视频正处在关闭状态");
    }
}
