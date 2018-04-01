package com.qgl.study.BridgeDesing.demo;

/**
 * 手机短消息方式
 * @Author qiangl
 * Created by qgl on 2018/3/20.
 */
public class MessageMobile implements MessageImplementor {
    public void send(String message, String toUser) {
        System.out.println("使用手机短信息的方式，发送消息'"
        + message + "'给" + toUser);
    }
}
