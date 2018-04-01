package com.qgl.study.BridgeDesing.simpleDemo;

/**
 * 桥接模式：  短消息案例接口
 * @Author qiangl
 * Created by qgl on 2018/3/20.
 */
public interface Message {

    public void send(String message,String toUser);
}
