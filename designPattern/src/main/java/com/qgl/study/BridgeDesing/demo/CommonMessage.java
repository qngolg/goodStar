package com.qgl.study.BridgeDesing.demo;

/**
 * 扩展抽象的消息接口
 * 普通消息
 * @Author qiangl
 * Created by qgl on 2018/3/20.
 */
public class CommonMessage extends  AbstractMessage{
    /**
     * 构造方法，传入实现部分的对象
     *
     * @param impl 实现部分的对象
     */
    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    public void sendMessage(String message,String toUser){
        super.sendMessage(message,toUser);
    }
}
