package com.qgl.study.BridgeDesing.simpleDemo;

/**
 * 加急消息的抽象接口
 * @Author qiangl
 * Created by qgl on 2018/3/20.
 */
public interface UrgencyMessage extends Message {

    /**
     * 监控某消息的处理过程
     * @param messageId 被监控的消息编号
     * @return 包含监控的数据对象，这里只示意一下，所以用Object
     */
    public Object watch(String messageId);
}
