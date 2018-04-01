package com.qgl.study.BridgeDesing.demo;

/**
 * 特急消息
 * @Author qiangl
 * Created by qgl on 2018/3/20.
 */
public class SpecialUrgencyMessage extends AbstractMessage {
    /**
     * 构造方法，传入实现部分的对象
     *
     * @param impl 实现部分的对象
     */
    public SpecialUrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    /**
     * 催促业务
     * @param messageId
     */
    public void hurry(String messageId){
        //执行催促的业务，发出催促的信息
    }

    public void sendMessage(String message,String toUser){
        message = "特急：" + message;
        super.sendMessage(message,toUser);
        //还需要增加一条待催促的信息
    }

}
