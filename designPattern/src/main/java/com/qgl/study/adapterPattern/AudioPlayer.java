package com.qgl.study.adapterPattern;


/**
 * @Author qiangl
 * Created by qgl on 2018/3/29.
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;


    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file.name :" + fileName);
        }else if(audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else{
            System.out.println("Invalid media."+audioType + " format not supported");
        }
    }
}
