package com.qgl.study.BridgeDesing.demo;

/**
 * 实现发送消息的统一接口
 * @Author qiangl
 * Created by qgl on 2018/3/20.
 */
public interface MessageImplementor {

    /**
     * 发送消息
     * @param message 要发送的消息内容
     * @param toUser 消息发送的目的人员
     */
    public void send(String message,String toUser);
}
