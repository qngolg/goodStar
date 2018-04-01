package com.qgl.study.BridgeDesing.demo;

/**
 * 以Email的方式发送消息
 * @Author qiangl
 * Created by qgl on 2018/3/20.
 */
public class MessageEmail implements MessageImplementor {
    public void send(String message, String toUser) {
        System.out.println("使用Email的方式，发送消息'"
        +message + "'给" + toUser);
    }
}
