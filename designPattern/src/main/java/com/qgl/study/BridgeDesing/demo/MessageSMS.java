package com.qgl.study.BridgeDesing.demo;

/**
 * 短信方式
 * @Author qiangl
 * Created by qgl on 2018/3/20.
 */
public class MessageSMS implements MessageImplementor {
    public void send(String message, String toUser) {
        System.out.println("使用站内短消息的方式，发送消息'"
        + message + "'给" + toUser);
    }
}
