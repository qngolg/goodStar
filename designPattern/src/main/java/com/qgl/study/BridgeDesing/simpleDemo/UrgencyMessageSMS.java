package com.qgl.study.BridgeDesing.simpleDemo;

/**
 *
 * 发送加急站内短消息
 * @Author qiangl
 * Created by qgl on 2018/3/20.
 */
public class UrgencyMessageSMS implements UrgencyMessage {
    public Object watch(String messageId) {
        //获取相应的数据，组织成监控的数据对象，然后返回
        return null;
    }

    public void send(String message, String toUser) {
        message = "加急：" + message;
        System.out.println("使用站内短消息的方式，发送消息'"
        + message + "'给" + toUser);
    }
}
