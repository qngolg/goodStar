package com.qgl.study.adapterPattern;

/**
 * 高级媒体播放器
 * 可以播放vlc Mp4
 * @Author qiangl
 * Created by qgl on 2018/3/29.
 */
public interface AdvancedMediaPlayer {

    public void playVlc(String fileName);
    public void playMp4(String fileName);
}
