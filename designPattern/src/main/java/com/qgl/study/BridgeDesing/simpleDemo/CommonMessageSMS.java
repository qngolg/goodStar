package com.qgl.study.BridgeDesing.simpleDemo;

/**
 * 以站内短消息的方式发送普通短消息
 * @Author qiangl
 * Created by qgl on 2018/3/20.
 */
public class CommonMessageSMS implements Message {
    public void send(String message, String toUser) {
        System.out.println("使用站内短消息的方式，发送消息'"+message+"'给"+toUser);
    }
}
