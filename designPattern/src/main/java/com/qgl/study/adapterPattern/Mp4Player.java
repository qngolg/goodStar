package com.qgl.study.adapterPattern;

/**
 * @Author qiangl
 * Created by qgl on 2018/3/29.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {

    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file.name :" + fileName );
    }
}
