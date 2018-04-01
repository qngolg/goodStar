package com.qgl.study.adapterPattern;

/**
 * @Author qiangl
 * Created by qgl on 2018/3/29.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file.name : " + fileName);
    }

    public void playMp4(String fileName) {

    }
}
