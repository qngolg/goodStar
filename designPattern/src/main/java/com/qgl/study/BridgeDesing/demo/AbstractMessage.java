package com.qgl.study.BridgeDesing.demo;

/**
 * 抽象的消息对象
 * @Author qiangl
 * Created by qgl on 2018/3/20.
 */
public abstract class AbstractMessage {


    /**
     * 持有一个实现部分的对象
     */
    protected MessageImplementor impl;

    /**
     * 构造方法，传入实现部分的对象
     * @param impl 实现部分的对象
     */
    public AbstractMessage(MessageImplementor impl){
        this.impl = impl;
    }

    /**
     * 发送消息，转调实现部分的方法
     * @param message
     * @param toUser
     */
    public void sendMessage(String message,String toUser){
        this.impl.send(message,toUser);
    }

}
