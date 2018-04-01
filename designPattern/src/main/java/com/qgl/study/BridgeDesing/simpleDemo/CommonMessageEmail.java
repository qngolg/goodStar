package com.qgl.study.BridgeDesing.simpleDemo;

/**
 * @Author qiangl
 * Created by qgl on 2018/3/20.
 */
public class CommonMessageEmail implements Message {
    public void send(String message, String toUser) {
        System.out.println("使用Email的方式，发送消息'"
        + message + "'给" + toUser);
    }
}
